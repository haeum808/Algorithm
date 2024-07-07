import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())
    val targetNumbers = List(8) { st.nextToken() }

    val ascendingNumbers = listOf("1", "2", "3", "4", "5", "6", "7", "8")
    val descendingNumbers = listOf("8", "7", "6", "5", "4", "3", "2", "1")

    when(targetNumbers) {
        ascendingNumbers -> bw.write("ascending")
        descendingNumbers -> bw.write("descending")
        else -> bw.write("mixed")
    }

    bw.flush()
    bw.close()
}