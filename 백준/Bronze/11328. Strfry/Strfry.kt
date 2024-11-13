import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val n = readLine().toInt()

  repeat(n) {
    val alphabet = IntArray(26)
    val (a, b) = readLine().split(" ")
    var result = "Possible"

    for (char in a) alphabet[char - 'a']++
    for (char in b) alphabet[char - 'a']--

    for (i in 0..<26) {
      if (alphabet[i] != 0) {
        result = "Impossible"
        break
      }
    }

    bw.write("$result\n")
  }
  
  bw.flush()
  bw.close()
  close()
}
