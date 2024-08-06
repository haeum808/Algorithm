    import java.io.BufferedReader
    import java.io.BufferedWriter
    import java.io.InputStreamReader
    import java.io.OutputStreamWriter

    fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val balls = IntArray(n) { it + 1 }

        repeat(m) {
            val (i, j) = readLine().split(" ").map { it.toInt() - 1 }

            val temp = balls[i]
            balls[i] = balls[j]
            balls[j] = temp
        }

        bw.write(balls.joinToString(" "))
        bw.flush()
        bw.close()
        close()
    }
