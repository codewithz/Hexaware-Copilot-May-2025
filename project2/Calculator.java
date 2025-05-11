public class Calculator {

    public int calculate(int a, int b, String op) {
        if (op.equals("add")) {
            return a + b;
        } else if (op.equals("subtract")) {
            return a - b;
        } else if (op.equals("multiply")) {
            return a * b;
        } else if (op.equals("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
