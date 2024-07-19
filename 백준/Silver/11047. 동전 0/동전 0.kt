import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (n, k) = readLine().split(" ").map { it.toInt() }
    val coins = mutableListOf<Int>()
    var result = 0

    repeat(n) {
        val coin = readLine().toInt()

        if (coin <= k) {
            coins.add(coin)
        }
    }

    coins.reversed().forEach {
        result += k / it
        k %= it
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}
