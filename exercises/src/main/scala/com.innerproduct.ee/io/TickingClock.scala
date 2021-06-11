package com.innerproduct.ee.io

import cats.effect._

// Let’s create a more complex application: a ticking clock. It should print the
//current time every second.

// 1. tickingClock should print the current time every second. Use
// System.currentTimeMillis to be simple. How do you wake up every
// second? (Hint: You can use IO.sleep.) And how do you do this repeatedly?

object TickingClock extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    tickingClock.as(ExitCode.Success)

  val tickingClock: IO[Unit] = ??? // <1>
}
