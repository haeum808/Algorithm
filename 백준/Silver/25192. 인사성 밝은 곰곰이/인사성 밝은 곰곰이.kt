import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val temp = hashSetOf<String>()
    var answer = 0

    repeat(n) {
        val input = readLine()

        if (input == "ENTER") {
            answer += temp.size
            temp.clear()
        } else {
            temp.add(input)
        }
    }

    answer += temp.size

    bw.write("$answer")
    bw.flush()
    bw.close()
    close()
}
