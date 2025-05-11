public class CalculatorDTO {

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private int a;
    private int b;
    private Operation operation;

    // Getters and Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
