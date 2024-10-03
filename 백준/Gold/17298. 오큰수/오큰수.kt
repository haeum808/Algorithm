import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val results = IntArray(n + 1)
    results[n] = -1
    val stack = Stack<Pair<Int, Int>>()
    val numbers = readLine().split(" ").map { it.toInt() }
    var index = 0

    while (index != n - 1) {
        stack.push(index to numbers[index])

        while (stack.isNotEmpty() && stack.peek().second < numbers[index + 1]) {
            results[stack.pop().first + 1] = numbers[index + 1]
        }

        index++
    }

    while (stack.isNotEmpty()) {
        results[stack.pop().first + 1] = -1
    }

    for(i in 1.. n) {
        bw.write("${results[i]} ")
    }

    bw.flush()
    bw.close()
    close()
}
