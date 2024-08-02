import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val map = HashMap<String, Boolean>()

    repeat(n) {
        val (name, status) = readLine().split(" ")

        if (!map.containsKey(name)) {
            map[name] = true
        } else {
            map.remove(name)
        }
    }

    map.keys.sortedDescending().forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}
