import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val counts = HashMap<String, Int>()
    val input = readLine()

    for (char in input) {
        counts[char.uppercase()] = counts.getOrDefault(char.uppercase(), 0) + 1
    }

    if (counts.size == 1) {
        bw.write(input[0].uppercase())
    } else {
        val sortedCount = counts.toList().sortedByDescending { it.second }
        val biggest = sortedCount[0]
        val secondBiggest = sortedCount[1]


        if (biggest.second == secondBiggest.second) {
            bw.write("?")
        } else {
            bw.write(biggest.first)
        }
    }

    bw.flush()
    bw.close()
    close()
}