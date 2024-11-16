import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var result = 0
    val map = HashMap<String, Int>()

    for (i in 1..n) {
        val input = readLine()
        map[input] = i
    }

    for (i in 1..n) {
        val input = readLine()

        for (value in map.values) {
            if (map[input]!! > value) {
                result++
                break
            }
        }

        map.remove(input)
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
