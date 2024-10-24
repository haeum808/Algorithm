import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${readLine().replace("c=|c-|dz=|d-|lj|nj|s=|z=".toRegex(), "*").length}")

    bw.flush()
    bw.close()
    close()
}