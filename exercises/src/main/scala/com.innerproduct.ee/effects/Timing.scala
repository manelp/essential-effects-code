package com.innerproduct.ee.effects

import scala.concurrent.duration.FiniteDuration

//1. Write a clock action that returns the current time in milliseconds, i.e., via
//System.currentTimeMillis.
//2. Write a timer that records the duration of another action.
object Timing extends App {
  val clock: MyIO[Long] =
    ??? // <1>

  def time[A](action: MyIO[A]): MyIO[(FiniteDuration, A)] =
    ??? // <2>

  val timedHello = Timing.time(MyIO.putStr("hello"))

  timedHello.unsafeRun() match {
    case (duration, _) => println(s"'hello' took $duration")
  }
}
