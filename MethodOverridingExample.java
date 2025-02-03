import java.util.*;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() { // Overriding the parent method
        System.out.println("Dog barks");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        myAnimal.makeSound(); 

        Animal myDog = new Dog(); 
        myDog.makeSound();  
    }
}
