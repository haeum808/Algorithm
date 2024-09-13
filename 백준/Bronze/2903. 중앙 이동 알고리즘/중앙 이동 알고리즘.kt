import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val map = mapOf(
        1 to (1 + 2 * 1) * (1 + 2 * 1),
        2 to (1 + 2 * 2) * (1 + 2 * 2),
        3 to (1 + 2 * 4) * (1 + 2 * 4),
        4 to (1 + 2 * 8) * (1 + 2 * 8),
        5 to (1 + 2 * 16) * (1 + 2 * 16),
        6 to (1 + 2 * 32) * (1 + 2 * 32),
        7 to (1 + 2 * 64) * (1 + 2 * 64),
        8 to (1 + 2 * 128) * (1 + 2 * 128),
        9 to (1 + 2 * 256) * (1 + 2 * 256),
        10 to (1 + 2 * 512) * (1 + 2 * 512),
        11 to (1 + 2 * 1024) * (1 + 2 * 1024),
        12 to (1 + 2 * 2048) * (1 + 2 * 2048),
        13 to (1 + 2 * 4096) * (1 + 2 * 4096),
        14 to (1 + 2 * 8192) * (1 + 2 * 8192),
        15 to (1 + 2 * 16384) * (1 + 2 * 16384),
    )

    bw.write("${map[n]}")
    bw.flush()
    bw.close()
    close()
}
