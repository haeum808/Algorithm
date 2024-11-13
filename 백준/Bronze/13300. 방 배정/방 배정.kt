import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val boys = IntArray(7)
  val girls = IntArray(7)
  val (n, k) = readLine().split(" ").map { it.toInt() }
  var result = 0

  repeat(n) {
    val (s, y) = readLine().split(" ").map { it.toInt() }

    if (s == 0) {
      girls[y]++
    } else {
      boys[y]++
    }
  }

  for (i in 1..6) {
    result += if (boys[i] % k == 0) {
      boys[i] / k
    } else {
      boys[i] / k + 1
    }
  }

  for (i in 1..6) {
    result += if (girls[i] % k == 0) {
      girls[i] / k
    } else {
      girls[i] / k + 1
    }
  }

  bw.write("$result")
  bw.flush()
  bw.close()
  close()
}
