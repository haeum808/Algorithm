import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val s = readLine()
    val q = readLine().toInt()
    val arr2d = Array(26) { IntArray(200_001) }
    val alphabet = IntArray(26)
    var index = 0

    for (char in s) {
        alphabet[char - 'a']++

        for (i in 0..<26) {
            arr2d[i][index] = alphabet[i]
        }
        index++
    }

    repeat(q) {
        val (target, l, r) = readLine().split(" ")

        val left = l.toInt()
        val right = r.toInt()

        if (left == 0) {
            bw.write("${arr2d[target[0] - 'a'][right]}\n")
        } else {
            bw.write("${arr2d[target[0] - 'a'][right] - arr2d[target[0] - 'a'][left - 1]}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
