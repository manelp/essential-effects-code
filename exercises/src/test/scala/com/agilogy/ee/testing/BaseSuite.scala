package com.agilogy.ee.testing

import cats.effect.{ IO, Resource }

import munit.CatsEffectSuite

abstract class BaseSuite[S, R] extends CatsEffectSuite {

  val resource: Resource[IO, R]

  def setInitialState(repo: R, values: S): IO[Unit]

  def getFinalState(repo: R): IO[S]

  def check[A](initialState: S, expectedFinalState: S, expectedResult: A)(f: R => IO[A]): Unit =
    resource.use { repo =>
      for {
        _          <- setInitialState(repo, initialState)
        res        <- f(repo)
        _          = assertEquals(res, expectedResult, "Expected result don't match")
        finalState <- getFinalState(repo)
        _          = assertEquals(finalState, expectedFinalState, "Final state don't match")
      } yield ()
    }.unsafeRunSync()

}
