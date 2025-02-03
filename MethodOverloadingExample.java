import java.util.*;
class MathOperations {
    // Method with two int parameters
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    // Method with three int parameters
    void add(int a, int b, int c) {
        System.out.println("Sum (three int): " + (a + b + c));
    }

    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        obj.add(10, 20);      // Calls first method
        obj.add(10, 20, 30);  // Calls second method
        obj.add(5.5, 2.5);    // Calls third method
    }
}
