import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var set = mutableSetOf<Int>()

    repeat(n) {
        val st = StringTokenizer(readLine())

        when(st.nextToken()) {
            "add" -> {
                set.add(st.nextToken().toInt())
            }
            "remove" -> {
                set.remove(st.nextToken().toInt())
            }
            "check" -> {
                if (set.contains(st.nextToken().toInt())) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "toggle" -> {
                val number = st.nextToken().toInt()

                if (set.contains(number)) {
                    set.remove(number)
                } else {
                    set.add(number)
                }

            }
            "all" -> {
                set = (1..20).toMutableSet()
            }
            "empty" -> {
                set.clear()
            }
        }
    }

    bw.flush()
    bw.close()
}
