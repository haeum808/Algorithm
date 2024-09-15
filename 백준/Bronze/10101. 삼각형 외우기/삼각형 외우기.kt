import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()

    when {
        a == 60 && b == 60 && c == 60 -> bw.write("Equilateral")
        a + b + c == 180 && a != b && b != c && a != c -> bw.write("Scalene")
        a + b + c != 180 -> bw.write("Error")
        else -> bw.write("Isosceles")
    }

    bw.flush()
    bw.close()
    close()
}
