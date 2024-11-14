import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack
import java.util.StringTokenizer

data class Building(
    val height: Int,
    val index: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val stack = Stack<Building>()
    stack.push(Building(100_000_001,0))


    for (i in 1..n) {
        val nextBuilding = Building(st.nextToken().toInt(), i)

        while (stack.peek().height < nextBuilding.height) {
            stack.pop()
        }

        bw.write("${stack.peek().index} ")
        stack.push(nextBuilding)
    }

    bw.flush()
    bw.close()
    close()
}
