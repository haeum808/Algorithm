import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val points = sortedSetOf<Point>()

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        points.add(Point(x, y))
    }

    points.forEach {
        bw.write("${it.x} ${it.y}\n")
    }

    bw.flush()
    bw.close()
}

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return if (x == other.x) {
            y - other.y
        } else {
            x - other.x
        }
    }
}
