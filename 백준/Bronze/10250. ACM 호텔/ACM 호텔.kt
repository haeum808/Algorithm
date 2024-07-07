import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val st = StringTokenizer(readLine())
        val h = st.nextToken().toInt()
        val w = st.nextToken().toInt()
        val n = st.nextToken().toInt()
        var count = 1

        for (i in 1..w) {
            for (j in 1..h) {
                if (count++ == n) {
                    if (i <= 9) {
                        bw.write("${j}0${i}\n")
                    } else {
                        bw.write("${j}${i}\n")
                    }
                    break
                }
            }
        }
    }

    bw.flush()
    bw.close()
}