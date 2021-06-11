package com.innerproduct.ee.io

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import cats.effect.{ ExitCode, IO, IOApp }

object Futures extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    fut.map(println).as(ExitCode.Success)

  val fut: IO[String] = IO.fromFuture(IO(futurish))

  def futurish: Future[String] = Future("hello world!")
}
