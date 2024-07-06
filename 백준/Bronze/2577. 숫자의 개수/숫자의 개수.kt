import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val result = IntArray(10)

    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    val mul = a * b * c

    mul.toString().forEach {
        result[it - '0']++
    }

    result.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}