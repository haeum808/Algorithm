import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val n = readLine().toInt()
  val map = HashMap<Int, Boolean>()
  val numbers = readLine().split(" ").map { it.toInt() }
  val x = readLine().toInt()
  var count = 0

  for (index in 0..<n) {
    if (map[x - numbers[index]] != null) count++
    else map[numbers[index]] = true
  }

  bw.write("$count")
  bw.flush()
  bw.close()
  close()
}
