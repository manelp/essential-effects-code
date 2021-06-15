
// Functors

// def map[B](f: A => B): F[B]

List(1, 2, 3).map(_ + 1)

Option(1).map(_ + 1)

import cats.implicits._

import com.innerproduct.ee.effects.MyIO
// as
// void


// Applicatives

Option(1).map(_ + 1)
(Option(1), Option(2)).mapN(_ + _ + 1)


// Monads

// def flatMap[B](f: A => F[B]): F[B]

//val fa: F[A] = ???
//def nextB(a: A): F[B] = ???
//def nextC(b: B): F[C] = ???
//
//val fc: F[C] = fa.flatMap(a => nextB(a).flatMap(b => nextC(b)))
//
//for {
//  a <- fa
//  b <- nextB(a)
//  c <- nextC(b)
//} yield c

