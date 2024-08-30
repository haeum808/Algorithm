import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numberOfComputers = readLine().toInt()
    val numberOfEdges = readLine().toInt()
    val graph = Array(numberOfComputers + 1) { LinkedList<Int>() }
    val isVisited = BooleanArray(numberOfComputers + 1)

    repeat(numberOfEdges) {
        val (vertex1, vertex2) = readLine().split(" ").map { it.toInt() }
        graph[vertex1].add(vertex2)
        graph[vertex2].add(vertex1)
    }

    fun dfs(r: Int) {
        isVisited[r] = true

        for (edge in graph[r]) {
            if (!isVisited[edge]) {
                dfs(edge)
            }
        }
    }

    dfs(1)
    
    bw.write("${isVisited.count { it } - 1}")
    bw.flush()
    bw.close()
    close()
}
