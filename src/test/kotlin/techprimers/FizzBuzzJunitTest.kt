package techprimers

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FizzBuzzJunitTest {

    @Before
    fun before () {

    }

    @Test
    fun testFizzBuzz() {
        var fizzBuzz: FizzBuzzI = FizzBuzz()
        Assert.assertEquals(fizzBuzz.calculate(1), "1")
    }

}