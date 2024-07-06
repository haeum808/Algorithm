import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())

    var h = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    if (h == 0) h = 24

    val targetH = ((h * 60) + m - 45) / 60
    val targetM = if (m >= 45) m - 45 else m + 15

    if (targetH == 24) {
        bw.write("0 $targetM")
    } else {
        bw.write("$targetH $targetM")
    }

    bw.flush()
    bw.close()
}