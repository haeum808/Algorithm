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
        var index = 0

        for (char in input) {
            when (char) {
                '<' -> if (index != 0) index--
                '>' -> if (index != result.size) index++
                '-' -> if (index != 0 && result.isNotEmpty()) result.removeAt(--index)
                else -> result.add(index++, char)
            }
        }

        bw.write("${result.joinToString("")}\n")
    }

    bw.flush()
    bw.close()
    close()
}
