import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()
    val numbers:Queue<Int> = LinkedList()

    input.split("+", "-").forEach {
        numbers.offer(it.toInt())
    }

    var answer = numbers.poll()
    var isMinus = false

    for (index in input.indices) {
        if (input[index] == '-' || isMinus) {
            if (input[index] == '-' || input[index] == '+')
                answer -= numbers.poll()
            isMinus = true
        } else if (input[index] == '+'){
            answer += numbers.poll()
            isMinus = false
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()
    close()
}
