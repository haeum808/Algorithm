import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    val gcd = gcd(a, b)
    val lca = lca(gcd, a, b)

    bw.write("$gcd\n$lca")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) return b

    return gcd(b, a % b)
}

fun lca(gcd: Int, a: Int, b: Int): Int {
    return a * b / gcd
}