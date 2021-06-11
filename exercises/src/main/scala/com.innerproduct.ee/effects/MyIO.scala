package com.innerproduct.ee.effects

// 1. Already defined
// 2. putStr should capture the print effect
// 3. Get an instance
// 4. Run the effect
// 5. Implement map function
// 6. Implement flatMap

case class MyIO[A](unsafeRun: () => A) { // <1>
  def map[B](f: A => B): MyIO[B]           = ??? // 5
  def flatMap[B](f: A => MyIO[B]): MyIO[B] = ??? // 6

}
object MyIO {
  def putStr(s: => String): MyIO[Unit] =
    ??? // <2>
}

object Printing extends App {
  val hello = MyIO.putStr("hello!") // <3>

  hello.unsafeRun() // 4
}
