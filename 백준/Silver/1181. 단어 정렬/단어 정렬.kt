import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val treeSet = sortedSetOf<Word>()

    repeat(n) {
        treeSet.add(Word(readLine()))
    }

    treeSet.forEach {
        bw.write("${it.value}\n")
    }

    bw.flush()
    bw.close()
}

class Word(val value: String) : Comparable<Word> {
    override fun compareTo(other: Word): Int {
        return if (value.length == other.value.length) {
            value.compareTo(other.value)
        } else {
            value.length - other.value.length
        }
    }
}
