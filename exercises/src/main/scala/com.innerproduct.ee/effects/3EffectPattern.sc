import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


// Option is an effect
val x = Some(1)


// What about future?
val print = Future(println("Hello World!"))
val twice =
  print
    .flatMap(_ => print)