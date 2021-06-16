import scala.concurrent.duration.{DurationInt, FiniteDuration}
import scala.concurrent.{ExecutionContext, Future}

import cats.effect._

import com.innerproduct.ee.control.Start.contextShift

//// Constructors ////

// delay
IO.delay(1 + 2)
// apply
// pure

// Exceptions

// raiseError


// exponential backoff?
 def retryWithBackoff[A](ioa: IO[A], initialDelay: FiniteDuration, maxRetries: Int)
                        (implicit timer: Timer[IO]): IO[A] = ???

//// Eliminators, do not ever use in normal code! ////

// unsafeRunSync
// unsafeToFuture

//// Combinators ////

// map
// as
// void

// mapN
// tupled

// flatMap

// handleErrorWith
// handleError
// adaptError
// attempt