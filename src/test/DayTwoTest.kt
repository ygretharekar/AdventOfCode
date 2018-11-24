package test

import main.DayTwo
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.fail

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

//    @BeforeEach
//    fun setUp() {
//    }

//
//    @AfterEach
//    fun tearDown() {
//    }


    @Test
    internal fun part2SolutionExampleMatch() {
        assertEquals(9, DayTwo(listOf("5 9 2 8", "9 4 7 3", "3 8 6 5")).part2Solution(), "part 2 failed")
    }

    @Test
    internal fun part2SolutionOnInput() {
        println(
            DayTwo(
                File(
                    "E:\\codes\\java\\AdventOfCode\\src\\test\\day_two_input.txt"
                )
                    .readLines()
                    .toList()
            ).part2Solution()
        )

        assert(
            DayTwo(
                File(
                    "E:\\codes\\java\\AdventOfCode\\src\\test\\day_two_input.txt"
                )
                    .readLines()
                    .toList()
            ).part2Solution() > 0
        )

    }
}