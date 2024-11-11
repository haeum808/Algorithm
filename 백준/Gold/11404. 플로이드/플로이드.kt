import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val m = readLine().toInt()
    val graph = Array(n + 1) { IntArray(n + 1) { 100_000_001 } }

    for (a in 1..n) {
        for (b in 1..n) if (a == b) graph[a][b] = 0
    }

    repeat(m) {
        val (a, b, c) = readLine().split(" ").map { it.toInt() }

        if (graph[a][b] > c) graph[a][b] = c
    }

    for (k in 1..n) {
        for (a in 1..n) {
            for (b in 1..n) {
                graph[a][b] = minOf(graph[a][b], graph[a][k] + graph[k][b])
            }
        }
    }
    
    for (a in 1..n) {
        for (b in 1..n) {
            if (graph[a][b] == 100_000_001) print("0 ")
            else print("${graph[a][b]} ")
        }
        println()
    }

    bw.flush()
    bw.close()
    close()
}
