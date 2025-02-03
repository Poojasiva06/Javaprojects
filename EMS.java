// Design an Employee Management System where you create an abstract class Employee with abstract methods like calculateSalary() and displayDetails(). 
// Create two derived classes, FullTimeEmployee and PartTimeEmployee, and implement the abstract methods. For FullTimeEmployee, calculate salary as a 
// fixed monthly rate, and for PartTimeEmployee, calculate salary based on hourly rates. Demonstrate polymorphism by creating an array of Employee 
// objects and calculating/displaying salaries using overridden methods.

import java.util.*;
abstract class Employee{
    String name;
    int id;
    Employee(String name, int id)
    {
        this.name = name;
        this.id=id;
    }
    abstract double calculateSalary();
    abstract void displayDetails();

}
class FulltimeEmp extends Employee{
    double monthlyrate;
    FulltimeEmp(String name, int id, double monthlyrate)
    {
        super(name,id);
        this.monthlyrate =monthlyrate;
    }
    double calculateSalary()
    {
        return monthlyrate;
    }
    void displayDetails()
    {
        System.out.println("Full Time Employee");
        System.out.println(name);
        System.out.println(id);
        System.out.println(monthlyrate);
    }
}
class ParttimeEmp extends Employee{
    double hourlyrate;
    int workinghours;
    ParttimeEmp(String name, int id, double hourlyrate, int workinghours)
    {
        super(name,id);
        this.hourlyrate=hourlyrate;
        this.workinghours=workinghours;
    }
    double calculateSalary()
    {
        return hourlyrate*workinghours;
    }
    void displayDetails()
    {
        System.out.println("Part Time Employee");
        System.out.println(name);
        System.out.println(id);
        System.out.println(hourlyrate);
        System.out.println(workinghours);
    }
}
public class EMS {
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[2];

        employees[0] = new FulltimeEmp("Pooja", 101, 20000);
        employees[1] = new ParttimeEmp("Sri", 102, 20, 8);

        for (Employee emp : employees)
        {
            emp.displayDetails();
            System.out.println("Salary : "+ emp.calculateSalary() );
            System.out.println();
        }
    }
}
