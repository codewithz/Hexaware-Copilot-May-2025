import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factorial {
    public static int factorial(int n){
        // Returns the factorial of a given number n
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void printList(ArrayList<String> names){
        try{
            int[] list=new int[]{1,2,3,4,5};
            System.out.println(list[20]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("This will always execute");
        }
    }
}
