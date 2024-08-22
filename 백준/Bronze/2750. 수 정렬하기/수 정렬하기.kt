fun main() {
    val n = readln().toInt()
    val numbers = IntArray(n) { readln().toInt() }.sorted()

    numbers.forEach {
        println("$it")
    }
}