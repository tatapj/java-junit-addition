import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddTwoPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAddTwoNegativeNumbers() {
        assertEquals(-8, calculator.add(-5, -3));
    }

    @Test
    void testAddPositiveAndNegativeNumbers() {
        assertEquals(2, calculator.add(5, -3));
    }

    @Test
    void testAddZero() {
        assertEquals(7, calculator.add(7, 0));
    }
}