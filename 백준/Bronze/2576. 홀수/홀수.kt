import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  var sumOfOdd = 0
  var min = Int.MAX_VALUE

  repeat(7) {
    val next = readLine().toInt()

    if (next % 2 != 0) {
      sumOfOdd += next
      min = minOf(min, next)
    }
  }
  
  if (sumOfOdd == 0) {
    bw.write("-1")
  } else {
    bw.write("$sumOfOdd\n$min")
  }

  bw.flush()
  bw.close()
  close()
}
