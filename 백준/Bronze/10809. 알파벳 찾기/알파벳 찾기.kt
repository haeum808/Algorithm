import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val s = readLine()
    val alphabet = IntArray(26) { -1 }

    for(i in s.indices) {
        val targetIndex = s[i] - 'a'
        
        if (alphabet[targetIndex] == -1) {
            alphabet[targetIndex] = i
        }
    }

    bw.write(alphabet.joinToString(" "))
    bw.flush()
    bw.close()
}