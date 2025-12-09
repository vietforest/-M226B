package Calcualtor;
import Calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        // Create a real Calculator instance
        calculator = new Calculator();
    }

    // Test the CalculatorService without mocking Calculator
    @Test
    public void testCalculatorServiceWithoutMocking() {
        calculatorService = new CalculatorService(calculator);

        int result = calculatorService.addAndMultiplyByTwo(2, 3);

        // Add (2 + 3) = 5, then multiply by 2 -> 5 * 2 = 10
        assertEquals(10, result);
    }

    // Test the CalculatorService with mocking Calculator
    @Test
    public void testCalculatorServiceWithMocking() {
        // Mock the Calculator class
        calculator = Mockito.mock(Calculator.class);

        // Define the behavior of the mocked Calculator
        Mockito.when(calculator.add(2, 3)).thenReturn(5);

        calculatorService = new CalculatorService(calculator);

        int result = calculatorService.addAndMultiplyByTwo(2, 3);

        // (5) * 2 = 10
        assertEquals(10, result);

        // Verify that the add method was called with arguments 2 and 3
        Mockito.verify(calculator).add(2, 3);
    }

    // Test division by zero
    @Test
    public void testDivideByZero() {
        calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
