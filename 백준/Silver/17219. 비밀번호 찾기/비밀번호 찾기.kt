import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = HashMap<String, String>()

    repeat(n) {
        val (site, pwd) = readLine().split(" ")

        map[site] = pwd
    }

    repeat(m) {
        val site = readLine()

        bw.write("${map[site]}\n")
    }

    bw.flush()
    bw.close()
}
