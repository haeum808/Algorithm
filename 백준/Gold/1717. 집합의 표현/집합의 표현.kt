import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n + 1) { it }

    fun findParent(target: Int): Int {
        if (target != numbers[target]) {
            numbers[target] = findParent(numbers[target])
        }
        return numbers[target]
    }

    fun union(a: Int, b: Int) {
        val aParent = findParent(a)
        val bParent = findParent(b)

        if (aParent < bParent) {
            numbers[bParent] = aParent
        } else if (bParent < aParent) {
            numbers[aParent] = bParent
        }
    }

    repeat(m) {
        val (c, a, b) = readLine().split(" ").map { it.toInt() }

        if (c == 0) {
            union(a, b)
        } else if (c == 1) {
            if (findParent(a) == findParent(b)) {
                bw.write("YES\n")
            } else {
                bw.write("NO\n")
            }
        }
    }
    
    bw.flush()
    bw.close()
    close()
}

