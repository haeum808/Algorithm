import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = readLine()
    val n = LinkedList<Char>()
    str.forEach {
        n.add(it)
    }

    val iterator = n.listIterator(n.size)
    val m = readLine().toInt()

    repeat(m) {
        val input = readLine().split(" ")

        when (input[0]) {
            "L" -> if (iterator.hasPrevious()) iterator.previous()
            "D" -> if (iterator.hasNext()) iterator.next()
            "B" -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                    iterator.remove()
                }
            }

            "P" -> {
                iterator.add(input[1][0])
            }
        }
    }

    val answer = StringBuilder()
    n.forEach {
        answer.append(it)
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
    close()
}
