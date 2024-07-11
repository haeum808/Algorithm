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
        when(val input = readLine()) {
            "pop" -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.pop()}\n")
                }
            }
            "size" -> {
                bw.write("${stack.size}\n")
            }
            "empty" -> {
                if (stack.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "top" -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.peek()}\n")
                }
            }
            else -> {
                val (push, number) = input.split(" ")

                stack.push(number.toInt())
            }
        }
    }

    bw.flush()
    bw.close()
}
