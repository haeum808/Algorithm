import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val people = mutableListOf<Person>()

    repeat(n) {
        val (age, name) = readLine().split(" ")

        people.add(Person(age.toInt(), name))
    }

    people.sorted().forEach {
        bw.write("${it.age} ${it.name}\n")
    }

    bw.flush()
    bw.close()
}

data class Person(val age: Int, val name: String): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return age - other.age
    }
}
