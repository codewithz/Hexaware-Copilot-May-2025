import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// filepath: j:\Zartab\Trainings\2025\25-B-09-Hexaware-Copilot-May-2025\project2\CalculatorTest.java

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Arrange: Create a Calculator instance and define inputs
        Calculator calculator = new Calculator();
        int a = 5, b = 3;
        Calculator.Operation operation = Calculator.Operation.ADD;

        // Act: Perform the calculation
        int result = calculator.calculate(a, b, operation);

        // Assert: Verify the result
        assertEquals(8, result, "Addition operation failed");
    }

    @Test
    public void testSubtraction() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10, b = 4;
        Calculator.Operation operation = Calculator.Operation.SUBTRACT;

        // Act
        int result = calculator.calculate(a, b, operation);

        // Assert
        assertEquals(6, result, "Subtraction operation failed");
    }

    @Test
    public void testMultiplication() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 7, b = 6;
        Calculator.Operation operation = Calculator.Operation.MULTIPLY;

        // Act
        int result = calculator.calculate(a, b, operation);

        // Assert
        assertEquals(42, result, "Multiplication operation failed");
    }

    @Test
    public void testDivision() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 20, b = 4;
        Calculator.Operation operation = Calculator.Operation.DIVIDE;

        // Act
        int result = calculator.calculate(a, b, operation);

        // Assert
        assertEquals(5, result, "Division operation failed");
    }

    @Test
    public void testDivisionByZero() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10, b = 0;
        Calculator.Operation operation = Calculator.Operation.DIVIDE;

        // Act & Assert: Verify that an exception is thrown
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(a, b, operation);
        });

        // Assert: Verify the exception message
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    public void testInvalidOperation() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 5, b = 3;

        // Act & Assert: Verify that an exception is thrown for an unsupported operation
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            calculator.calculate(a, b, null);
        });

        // Assert: Verify the exception message
        assertEquals("Invalid operation.", exception.getMessage());
    }
}