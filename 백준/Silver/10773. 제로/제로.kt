import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val k = readLine().toInt()
    val stack = Stack<Int>()

    repeat(k) {
        val input = readLine().toInt()

        if (input == 0) {
            stack.pop()
        } else {
            stack.push(input)
        }
    }

    bw.write("${stack.sum()}")
    bw.flush()
    bw.close()
}