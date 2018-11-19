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
}