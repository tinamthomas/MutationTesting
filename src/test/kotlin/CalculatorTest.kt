import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {
    @Test
    fun shouldGetSum() {
        val result = Calculator().sum(10, 20)

        assertEquals(result, 30)
    }
}