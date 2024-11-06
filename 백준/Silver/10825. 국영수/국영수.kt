import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

data class Student(
    val name: String,
    val korean: Int,
    val english: Int,
    val math: Int,
): Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return if (korean == other.korean && english == other.english && math == other.math) {
            name.compareTo(other.name)
        } else if (korean == other.korean && english == other.english) {
            other.math - math
        } else if (korean == other.korean) {
            english - other.english
        } else {
            other.korean - korean
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val pq = PriorityQueue<Student>()

    repeat(n) {
        val (name, korean, english, math) = readLine().split(" ")

        pq.offer(Student(name, korean.toInt(), english.toInt(), math.toInt()))
    }

    while (pq.isNotEmpty()) {
        bw.write("${pq.poll().name}\n")
    }

    bw.flush()
    bw.close()
    close()
}
