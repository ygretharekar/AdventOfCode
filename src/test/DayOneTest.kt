package test

import main.dayOne
import main.dayOnePart2
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

internal class DayOneTest{
    @Test
    fun part1MatchesExamples(){
        assertEquals(3, dayOne("1122"), "1122 failed")
        assertEquals(4, dayOne("1111"), "1111 failed")
    }

    @Test
    internal fun dayOnePart1InputMatch() {
//        fail("Not Implemented")
        println(dayOne(File("E:\\codes\\java\\AdventOfCode\\src\\test\\day_one_input.txt").readText()))
        assert(dayOne(File("E:\\codes\\java\\AdventOfCode\\src\\test\\day_one_input.txt").readText()) > 0)
    }

    @Test
    internal fun dayOnePart2ExampleMatch() {
        assertEquals(6, dayOnePart2("1212"))
        assertEquals(0, dayOnePart2("1221"))
        assertEquals(12, dayOnePart2("123123"))
        assertEquals(4, dayOnePart2("12131415"), "failed herea")
    }

    @Test
    internal fun dayOnePart2Input() {
        println(dayOnePart2(File("E:\\codes\\java\\AdventOfCode\\src\\test\\day_one_input.txt").readText()))
        assert(dayOnePart2(File("E:\\codes\\java\\AdventOfCode\\src\\test\\day_one_input.txt").readText()) > 0)
    }
}