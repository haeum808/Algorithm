import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val array = IntArray(10)
  val n = readLine()
  var max = 0

  for (char in n) {
    if (char == '9') array[char - '3'] += 1
    else array[char - '0'] += 1
  }

  for(i in 0..9) {
      if (i == 6) max = maxOf(max, array[i] / 2 + if(array[i] % 2 == 0) 0 else 1)
      else max = maxOf(max, array[i])
  }

  bw.write("$max")
  bw.flush()
  bw.close()
  close()
}
