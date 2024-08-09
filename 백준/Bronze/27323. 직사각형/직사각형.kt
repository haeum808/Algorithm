import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine().toInt()
    val b = readLine().toInt()
    
    bw.write("${a * b}")
    bw.flush()
    bw.close()
    close()
}
