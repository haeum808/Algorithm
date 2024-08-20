import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val input = readLine()

        when(input[0]) {
            '1' -> {
                stack.push(input.split(" ")[1].toInt())
            }
            '2' -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.pop()}\n")
                }
            }
            '3' -> {
                bw.write("${stack.size}\n")
            }
            '4' -> {
                if (stack.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("${0}\n")
                }
            }
            '5' -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.peek()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
