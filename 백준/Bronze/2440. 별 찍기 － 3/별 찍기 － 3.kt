import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val n = readLine().toInt()

  for (i in 1..n) {
    repeat(n + 1 - i) {
      bw.write("*")
    }
    bw.write("\n")
  }

  bw.flush()
  bw.close()
  close()
}
