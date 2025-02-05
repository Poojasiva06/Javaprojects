import java.util.*;
import java.util.stream.Collectors;
class Employee {
    String name;
    int age;
    double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class StreamAPI {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pooja", 22, 50000));
        employees.add(new Employee("Sri", 27, 45000));
        employees.add(new Employee("Shanmu", 34, 60000));
        employees.add(new Employee("Pavi", 41, 40000));
        employees.add(new Employee("Shailu", 35, 70000));
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.toList());
        double averageSalary = filteredEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        List<String> employeeNames = filteredEmployees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employee Names: " + employeeNames);
        System.out.println("Average Salary: " + averageSalary);
    }
}
