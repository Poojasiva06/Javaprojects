package methodoverloading;
import java.util.*;
class MathOperations {
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum (three int): " + (a + b + c));
    }


    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        obj.add(10, 20);      
        obj.add(10, 20, 30);  
        obj.add(5.5, 2.5);    
    }
}
