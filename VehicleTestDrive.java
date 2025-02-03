// // Implement a class hierarchy for Vehicles with a base class Vehicle that contains a method startEngine(). Derive two classes: Car and 
// Motorcycle, both overriding the startEngine() method to print different messages indicating how their engines are started. Create 
// a method vehicleTestDrive(Vehicle vehicle) that accepts any object of 
// // type Vehicle and calls its startEngine() method. Demonstrate polymorphism by passing different vehicle objects to this method.

import java.util.*;
class Vehicle{
    void startEngine()
    {
        System.out.println("Vehicle engine starts");
    }
}
class Car extends Vehicle{
    void startEngine()
    {
        System.out.println("Car engine sarts with key");
    }
}
class Motorcycle extends Vehicle{
    void startEngine()
    {
        System.out.println("Motorcycle starts with button");
    }
}

public class VehicleTestDrive {
    public static void VehicleTestDrive( Vehicle vehicle){
        vehicle.startEngine();
    }
    public static void main(String[] args) {
        Vehicle mycar = new Car();
        Vehicle mymotorcycle = new Motorcycle();

        System.out.println("Car Test driving");
        VehicleTestDrive(mycar);

        System.out.println("Motocycle Test driving");
        VehicleTestDrive(mymotorcycle);
    }
}
