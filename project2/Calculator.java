public class Calculator {

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public int calculate(int a, int b, Operation op) {
        switch (op) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                return a / b;
            default:
                throw new UnsupportedOperationException("Invalid operation.");
        }
    }
}
