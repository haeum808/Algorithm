    import java.io.BufferedReader
    import java.io.BufferedWriter
    import java.io.InputStreamReader
    import java.io.OutputStreamWriter

    fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val balls = IntArray(n)

        repeat(m) {
            val (i, j, k) = readLine().split(" ").map { it.toInt() }

            for (l in i - 1 .. j - 1) {
                balls[l] = k
            }
        }

        balls.forEach {
            bw.write("$it ")
        }

        bw.flush()
        bw.close()
        close()
    }
