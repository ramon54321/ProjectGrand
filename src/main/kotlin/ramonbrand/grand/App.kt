package ramonbrand.grand

/**
 * @author      Ramon Brand <ramon.brand@reaktor.com>
 * @version     1.0
 */
fun main(args : Array<String>) {
  val x = arrayOf(2, 3, 4, 6, 7, 8)
  val y = x.binarySearch(5) * 2
  println(y)
}