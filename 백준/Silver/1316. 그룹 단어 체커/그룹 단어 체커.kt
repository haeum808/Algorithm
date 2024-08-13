import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    var count = t

    repeat(t) {
        val string = readLine()
        var lastChar = '?'
        val alphabet = BooleanArray(26)

        for (char in string) {
            val index = char - 'a'

            if (alphabet[index].not()) {
                alphabet[index] = true
            } else if (lastChar != char) {
                count--
                break
            }

            lastChar = char
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}