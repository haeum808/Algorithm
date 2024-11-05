import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (n, k) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()

    for (i in 1..<n) {
        var loc = i - 1
        val newItem = numbers[i]

        while (0 <= loc && newItem < numbers[loc]) {
            numbers[loc + 1] = numbers[loc]
            k--
            loc--

            if (k == 0) {
                bw.write(numbers.joinToString(" "))
                break
            }
        }

        if (k == 0) break

        if (loc + 1 != i){
            k--
            numbers[loc + 1] = newItem
        }

        if (k == 0) {
            bw.write(numbers.joinToString(" "))
            break
        }
    }

    if (k != 0) bw.write("-1")

    bw.flush()
    bw.close()
    close()
}
