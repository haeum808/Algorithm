import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val people = mutableListOf<Person>()

    repeat(n) {
        val (kg, cm) = readLine().split(" ").map { it.toInt() }

        people.add(Person(kg, cm, 1))
    }

    for (i in 0..<people.size) {
        for (j in i + 1..<people.size) {
            if (people[i].x > people[j].x && people[i].y > people[j].y) {
                people[j].rank++
            } else if(people[i].x < people[j].x && people[i].y < people[j].y){
                people[i].rank++
            }
        }
    }

    bw.write(people.map { it.rank }.joinToString(" "))
    bw.flush()
    bw.close()
}

data class Person(val x: Int, val y: Int, var rank: Int)