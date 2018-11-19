package test

import main.DayTwo
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

internal class DayTwoTest{
    @Test
    internal fun dayTwoPart1ExampleMatch(){
//        fail("Test implementation missing")
        assertEquals(18, DayTwo(listOf("5 1 9 4", "7 5 3", "2 4 6 8")).part1Solution(), "Test failed")
    }

    @Test
    internal fun dayTwoPart1InputMatch() {

        println(
            DayTwo(
                File(
                    "E:\\codes\\java\\AdventOfCode\\src\\test\\day_two_input.txt"
                )
                    .readLines()
                    .toList()
            ).part1Solution()
        )

        assert(
            DayTwo(
                File(
                    "E:\\codes\\java\\AdventOfCode\\src\\test\\day_two_input.txt"
                )
                    .readLines()
                    .toList()
            ).part1Solution() > 0
        )
    }
}