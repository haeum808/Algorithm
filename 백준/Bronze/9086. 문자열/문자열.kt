    import java.io.BufferedReader
    import java.io.BufferedWriter
    import java.io.InputStreamReader
    import java.io.OutputStreamWriter

    fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val t = readLine().toInt()

        repeat(t) {
            val input = readLine()

            bw.write("${input.first()}${input.last()}\n")
        }

        bw.flush()
        bw.close()
        close()
    }
