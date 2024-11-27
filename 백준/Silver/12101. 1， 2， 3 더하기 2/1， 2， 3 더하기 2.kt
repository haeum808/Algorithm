import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    var count = 0
    var answer = ""

    fun backtracking(result: String, sum: Int) {
        if(answer != "") return

        if (sum == n) {
            count++
            if (k == count) answer = result
            return
        }
        if (sum > n) {
            return
        }

        for (i in 1..3) {
            backtracking("$result+$i", sum + i)
            if(answer != "") return
        }
    }

    backtracking("", 0)

    if (answer == "") {
        bw.write("-1")
    } else {
        bw.write(answer.substring(1..<answer.length))
    }

    bw.flush()
    bw.close()
    close()
}
