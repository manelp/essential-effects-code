package com.innerproduct.ee.resources

import cats.effect._
import com.innerproduct.ee.debug._

// 1. We build a Resource[IO, String] with Resource.make, passing it two
//effectful functions. In this example, we add additional debug logging to see
//when these “lifecycle” effects execute.
// 2. The use method supplies the created String to the given function which
//must return an IO value. Again we debug log to see what String value was
//passed.

object BasicResource extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    stringResource.use { s => // <2>
      IO(s"$s is so cool!").debug
    }.as(ExitCode.Success)

  val stringResource: Resource[IO, String] = // <1>
    Resource.make(
      IO("> acquiring stringResource").debug *> IO("String")
    )(_ => IO("< releasing stringResource").debug.void)
}
