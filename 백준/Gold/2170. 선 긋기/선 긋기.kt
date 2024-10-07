import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.max

data class Point(
    val x: Int,
    val y: Int,
) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        return x - other.x
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val points = mutableListOf<Point>()

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        points.add(Point(x, y))
    }

    points.sort()

    val mergedPoints = mutableListOf<Point>()
    var currentPoint = points[0]

    for (i in 1 until n) {
        val nextPoint = points[i]

        if (currentPoint.y >= nextPoint.x) {
            currentPoint = Point(currentPoint.x, max(currentPoint.y, nextPoint.y))
        } else {
            mergedPoints.add(currentPoint)
            currentPoint = nextPoint
        }
    }
    mergedPoints.add(currentPoint)

    val totalDistance = mergedPoints.sumOf { abs(it.y - it.x) }

    bw.write("$totalDistance")
    bw.flush()
    bw.close()
    close()
}
