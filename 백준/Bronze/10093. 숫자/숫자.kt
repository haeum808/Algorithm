import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val (a, b) = readLine().split(" ").map { it.toLong() }
  var count = 0
  val sb = StringBuilder()

  for(i in minOf(a, b) + 1..<maxOf(a, b)) {
    count++
    sb.append("$i ")
  }

  bw.write("$count\n")
  bw.write("$sb")

  bw.flush()
  bw.close()
  close()
}
