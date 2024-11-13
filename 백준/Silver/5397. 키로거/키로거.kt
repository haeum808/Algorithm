import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val result = LinkedList<Char>()
        val input = readLine()
        var now = 0

        for (char in input) {
            when (char) {
                '<' -> if (now != 0) now--
                '>' -> if (now != result.size) now++
                '-' -> if (now != 0 && result.isNotEmpty()) result.removeAt(--now)
                else -> result.add(now++, char)
            }
        }

        bw.write("${result.joinToString("")}\n")
    }

    bw.flush()
    bw.close()
    close()
}
