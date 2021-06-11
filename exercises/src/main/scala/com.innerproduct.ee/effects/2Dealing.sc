
// Localized effects
def sum(ints: List[Int]): Int = {
  var sum = 0
  ints.foreach(i => sum += i)
  sum
}


sum(List(1, 2, 3))

// We still need to deal with environment