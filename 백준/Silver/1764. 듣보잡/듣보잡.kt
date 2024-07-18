import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }

    // 듣보잡의 수와 그 명단을 사전순으로 출력한다.

    val nListen = mutableMapOf<String, Boolean>()
    val list = mutableListOf<String>()

    repeat(n) {
        nListen[readLine()] = true
    }

    repeat(m) {
        val input = readLine()

        if (nListen.containsKey(input)) {
            list.add(input)
        }
    }

    bw.write("${list.size}\n")
    bw.write(list.sorted().joinToString("\n"))
    bw.flush()
    bw.close()
}
