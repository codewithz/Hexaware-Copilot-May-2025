import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeTest {

    @Test
    public void testMainWithPrimeNumber() {
        String input = "7\n";
        String expectedOutput = "Enter a number: 7 is a prime number.\n";

        assertMainOutput(input, expectedOutput);
    }

    @Test
    public void testMainWithNonPrimeNumber() {
        String input = "10\n";
        String expectedOutput = "Enter a number: 10 is not a prime number.\n";

        assertMainOutput(input, expectedOutput);
    }

    @Test
    public void testMainWithNumberOne() {
        String input = "1\n";
        String expectedOutput = "Enter a number: 1 is not a prime number.\n";

        assertMainOutput(input, expectedOutput);
    }

    @Test
    public void testMainWithNegativeNumber() {
        String input = "-5\n";
        String expectedOutput = "Enter a number: -5 is not a prime number.\n";

        assertMainOutput(input, expectedOutput);
    }

    private void assertMainOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Prime.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }
}