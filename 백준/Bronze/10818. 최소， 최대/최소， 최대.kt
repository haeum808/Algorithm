import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    var minNumber = st.nextToken().toInt()
    var maxNumber = minNumber

    for (i in 1 ..< n) {
        val target = st.nextToken().toInt()
        minNumber = min(minNumber, target)
        maxNumber = max(maxNumber, target)
    }

    bw.write("$minNumber $maxNumber")

    bw.flush()
    bw.close()
}