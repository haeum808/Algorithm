import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = ArrayList<Int>()

    fun choose(curNum: Int) {
        if (numbers.size != numbers.toSet().size) {
            return
        }

        if (curNum == m) {
            bw.write("${numbers.joinToString(" ")}\n")
            return
        }

        for (i in 1..n) {
            numbers.add(i)
            choose(curNum + 1)
            numbers.removeLast()
        }
    }

    choose(0)


    bw.flush()
    bw.close()
    close()
}
