import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().split(" ")
    val b = readLine().split(" ")
    val c = readLine().split(" ")

    val afront = a.count { it == "0" }
    val aback = 4 - afront
    val bfront = b.count { it == "0" }
    val bback = 4 - bfront
    val cfront = c.count { it == "0" }
    val cback = 4 - cfront

    bw.write("${answer(afront, aback)}\n")
    bw.write("${answer(bfront, bback)}\n")
    bw.write("${answer(cfront, cback)}")

    bw.flush()
    bw.close()
    close()
}

fun answer(front: Int, back: Int): Char {
  return when {
    front == 1 && back == 3 -> 'A'
    front == 2 && back == 2 -> 'B'
    front == 3 && back == 1 -> 'C'
    front == 4 && back == 0 -> 'D'
    else -> 'E'
  }
}
