import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
  val bw = BufferedWriter(OutputStreamWriter(System.out))
  val n = readLine().toInt()

  for (i in 1 .. n) {
    repeat(i) {
      bw.write("*")
    }
    repeat(n - i) {
      bw.write(" ")
    }
    repeat(n - i) {
      bw.write(" ")
    }
    repeat(i) {
      bw.write("*")
    }
    bw.write("\n")
  }

  for (i in n - 1 downTo 1) {
    repeat(i) {
      bw.write("*")
    }
    repeat(n - i) {
      bw.write(" ")
    }
    repeat(n - i) {
      bw.write(" ")
    }
    repeat(i) {
      bw.write("*")
    }
    bw.write("\n")
  }

  bw.flush()
  bw.close()
  close()
}