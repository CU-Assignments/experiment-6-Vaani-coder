import java.util.*;
/*22BCS12891*/
class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 45000));
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted Employees by Salary:");
        employees.forEach(System.out::println);
    }
}
