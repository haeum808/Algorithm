import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val edges = readLine().split(" ").map { it.toInt() }.sorted()

        if (edges.sum() == 0) break

        when {
            edges[2] >= edges[0] + edges[1] -> bw.write("Invalid\n")
            edges[0] == edges[2] -> bw.write("Equilateral\n")
            edges[0] == edges[1] || edges[1] == edges[2] -> bw.write("Isosceles\n")
            else -> bw.write("Scalene\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
