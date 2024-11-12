import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val numbers = IntArray(20) { it + 1 }

  repeat(10) {
    val (a, b) = readLine().split(" ").map { it.toInt() - 1 }

    for (i in 0..(b - a) / 2) {
      val temp = numbers[a + i]
      numbers[a + i] = numbers[b - i]
      numbers[b - i] = temp
    }
  }

  bw.write(numbers.joinToString(" "))
  bw.flush()
  bw.close()
  close()
}
