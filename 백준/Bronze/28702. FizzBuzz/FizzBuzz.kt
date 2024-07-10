import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine()
    val b = readLine()
    val c = readLine()
    val number = if (a.all { it.isDigit() }) {
        a.toInt() + 3
    } else if (b.all { it.isDigit() })  {
        b.toInt() + 2
    } else {
        c.toInt() + 1
    }

    when {
        number % 5 == 0 && number % 3 == 0 -> bw.write("FizzBuzz")
        number % 5 == 0 -> bw.write("Buzz")
        number % 3 == 0 -> bw.write("Fizz")
        else -> bw.write("$number")
    }

    bw.flush()
    bw.close()
}
