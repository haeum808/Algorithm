import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    var count = 0

    repeat(t) {
        val alphabet = IntArray(26)
        val input = readLine()

        var i = 0
        while (i < input.length) {
            var j = i + 1

            alphabet[input[i] - 'a'] += 1

                while (j < input.length) {
                    if (input[i] - 'a' != input[j] - 'a') {
                        break
                    }
                    j++
                }
            i = j
        }

        if (!alphabet.any { it > 1 }) {
            count++
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}