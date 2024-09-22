import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    fun isPalindrome(str: String, count: Int) {
        if (str.length <= 1) {
            bw.write("1 $count\n")
            return
        }

        if (str[0] != str[str.lastIndex]) {
            bw.write("0 $count\n")
            return
        }

        return isPalindrome(str.slice(1..<str.length - 1), count + 1)
    }

    repeat(n) {
        val input = readLine()

        isPalindrome(input, 1)
    }

    bw.flush()
    bw.close()
    close()
}

