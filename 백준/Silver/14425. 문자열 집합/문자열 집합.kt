import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val setN = mutableSetOf<String>()
    var count = 0

    repeat(n) {
        setN.add(readLine())
    }

    repeat(m) {
        if (setN.contains(readLine())) count++
    }

    bw.write("$count")
    bw.flush()
    bw.close()
}