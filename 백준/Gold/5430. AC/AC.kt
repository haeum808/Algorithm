import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        var isReversed = false
        var isError = false
        val commands = readLine()
        val n = readLine()
        val numbersStr = readLine()

        val numbers = if (numbersStr == "[]") {
            mutableListOf()
        } else {
            numbersStr.replace("[", "").replace("]", "").split(",").toMutableList()
        }

        for (command in commands) {
            if (command == 'R'){
                isReversed = !isReversed
            } else {
                if (isReversed) {
                    if (numbers.size == 0) {
                        isError =true
                        break
                    } else {
                        numbers.removeLast()
                    }
                } else {
                    if (numbers.size == 0) {
                        isError = true
                        break
                    } else {
                        numbers.removeFirst()
                    }
                }
            }
        }

        if (isError) {
            bw.write("error\n")
        } else {
            if (isReversed) {
                bw.write("[${numbers.reversed().joinToString(",")}]\n")
            } else {
                bw.write("[${numbers.joinToString(",")}]\n")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
