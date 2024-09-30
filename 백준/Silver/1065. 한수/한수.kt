import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var count = 0

    for (i in 1..n) {
        if (checkHansu(i)) {
            count++
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}

fun checkHansu(number: Int): Boolean {
    val str = number.toString()

    return when(str.length) {
        1 -> true
        2 -> true
        3 -> str[0] - str[1] == str[1] - str[2]
        4 -> false
        else -> throw IllegalArgumentException()
    }
}
