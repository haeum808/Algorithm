import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()
    val set = HashSet<String>()
    var result = 0

    for (i in 1..input.length) {
        for (j in 0..input.length - i) {
            set.add(input.substring(j, j + i))
        }
        result += set.size
        set.clear()
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}

