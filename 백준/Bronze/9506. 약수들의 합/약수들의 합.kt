import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun findPerfects(input: Int): List<Int> {
        return (1..<input).filter { input % it == 0 }
    }

    while (true) {
        val input = readLine().toInt()

        if (input == -1) {
            break
        }

        val perfects =findPerfects(input)

        if (perfects.sum() == input){
            bw.write("$input = ${perfects.joinToString(" + ")}\n")
        } else {
            bw.write("$input is NOT perfect.\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
