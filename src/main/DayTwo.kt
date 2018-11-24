package main

class DayTwo(input: List<String>){
    private val intInput: List<List<Int>> = getList(input)

    private fun getList(x: List<String>): List<List<Int>> {
        return x.map { it.split("""\s""".toRegex()).map { e -> e.toInt() } }
    }

    fun part1Solution(): Int {
        return intInput
            .map { it.sorted() }
            .map { it.last() - it.first() }
            .sum()
    }

    fun part2Solution(): Int = intInput.map { getDivisiblePair(it) }.map { it.second/it.first }.sum()

    private fun getDivisiblePair(x: List<Int>): Pair<Int, Int> {
        x.reversed().forEach {
            a -> x.forEach first@ {b ->
                    if (a == b) return@first
                    if (a < b && b%a == 0) return a to b
            }
        }
        throw IllegalStateException("no evenly division pair found")
    }
}