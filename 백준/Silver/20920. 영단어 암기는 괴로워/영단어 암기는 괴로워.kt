import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()

    repeat(n) {
        val input = readLine()

        if (input.length >= m) {
            map[input] = map.getOrDefault(input, 0) + 1
        }
    }

    map.entries.asSequence()
        .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenByDescending { it.key.length }
            .thenBy { it.key })
        .forEach {
            bw.write("${it.key}\n")
        }
    
    bw.flush()
    bw.close()
    close()
}
