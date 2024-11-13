import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val alphabet = IntArray(26)
  val input = readLine()

  for(char in input) {
    alphabet[char - 'a']++
  }

  bw.write(alphabet.joinToString(" "))
  bw.flush()
  bw.close()
  close()
}
