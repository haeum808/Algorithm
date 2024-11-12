import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val n = readLine().toInt()
  val numbers = readLine().split(" ").map { it.toInt() }
  var y = 0
  var m = 0

  for(i in 0..<n) {
    if (numbers[i] % 30 != 0) y += 10
    if (numbers[i] % 60 != 0) m += 15
    if (numbers[i] % 30 == 0) y += 10
    if (numbers[i] % 60 == 0) m += 15

    y += (numbers[i] / 30) * 10
    m += (numbers[i] / 60) * 15
  }

  when {
    y < m -> bw.write("Y $y")
    y > m -> bw.write("M $m")
    else -> bw.write("Y M $y")
  }

  bw.flush()
  bw.close()
  close()
}
