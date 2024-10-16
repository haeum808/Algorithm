import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val n = readLine().toInt()

        if (n == 0) {
            bw.write("0\n")
        } else {
            val map = mutableMapOf<String, Int>()

            repeat(n) {
                val (name, kind) = readLine().split(" ")
                map[kind] = map.getOrDefault(kind, 0) + 1
            }

            bw.write("${map.values.fold(1) { acc, i -> acc * (i + 1)} - 1}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
