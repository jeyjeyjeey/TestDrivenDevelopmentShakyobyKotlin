package money

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class MoneyTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        Assertions.assertEquals(Dollar(10), five.times(2))
        Assertions.assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        Assertions.assertTrue(Dollar(5) == (Dollar(5)))
        Assertions.assertFalse(Dollar(5) == (Dollar(6)))
    }

}