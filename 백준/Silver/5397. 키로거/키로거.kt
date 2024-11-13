import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val leftStack = Stack<Char>()
        val rightStack = Stack<Char>()
        val input = readLine()

        for (char in input) {
            when (char) {
                '<' -> if (leftStack.isNotEmpty()) rightStack.push(leftStack.pop())
                '>' -> if (rightStack.isNotEmpty()) leftStack.push(rightStack.pop())
                '-' -> if (leftStack.isNotEmpty()) leftStack.pop()
                else -> leftStack.push(char)
            }
        }

        bw.write("${leftStack.joinToString("")}${rightStack.reversed().joinToString("")}\n")
    }

    bw.flush()
    bw.close()
    close()
}
