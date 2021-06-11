import scala.concurrent.duration.DurationInt
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