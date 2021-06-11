package com.agilogy.ee.testing

import cats.effect.IO

import munit.FunSuite

final class CatsEffectSuiteSpec extends FunSuite {

  test("test example") {
    // setup
    val values = List(1, 2, 3)
    for {
      res <- IO.delay(values.sum) // run
      _   = assertEquals(res, 6)  // assert
    } yield ()
  }

  test("test fails side effects") {
    for {
      res <- IO.raiseError(new RuntimeException("Boom!")) // run
    } yield ()
  }

}
