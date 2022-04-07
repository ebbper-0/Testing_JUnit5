import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("10 - 5 = 5")
    void subtraction() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtraction(10, 5));

    }

    @Test
    @DisplayName("7 * 5 = 35")
    void multiplication() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiplication(7, 5));
    }
}

