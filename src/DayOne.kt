fun main(args: Array<String>) {
    println(dayOne("1122"))
}

fun dayOne(x: String): Int = (x + x[0])
    .toList()
    .map { it.toString().toInt() }
    .zipWithNext()
    .filter { it.first == it.second }
    .map { it.first }
    .sum()