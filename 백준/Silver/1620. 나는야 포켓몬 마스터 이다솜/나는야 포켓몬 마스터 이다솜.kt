import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }

    val map1 = mutableMapOf<String, Int>()
    val map2 = mutableMapOf<Int, String>()

    repeat(n) {
        val input = readLine()
        map1[input] = it + 1
        map2[it + 1] = input
    }

    repeat(m) {
        val input = readLine()

        if (input.toIntOrNull() == null) {
            bw.write("${map1[input]}\n")
        } else {
            bw.write("${map2[input.toInt()]}\n")
        }
    }

    bw.flush()
    bw.close()
}
