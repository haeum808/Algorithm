import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val alphabet1 = IntArray(26)
  val alphabet2 = IntArray(26)
  val a = readLine()
  val b = readLine()
  var result = 0

  for (char in a) {
    alphabet1[char - 'a']++
  }


  for (char in b) {
    if (alphabet1[char - 'a'] > 0) {
      alphabet1[char - 'a']--
    } else {
      alphabet2[char - 'a']++
    }
  }

  for (i in 0..<26) {
    result += alphabet1[i] + alphabet2[i]
  }

  bw.write("$result")  
  bw.flush()
  bw.close()
  close()
}