package Question_3;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class fibonacciTest {

    @Test
    public void testGenerateFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, fibonacci.generateFibonacci(10));
    }

    @Test
    public void testGenerateFibonacciWithNegativeTerms() {
        assertThrows(IllegalArgumentException.class, () -> fibonacci.generateFibonacci(-5));
        }
}