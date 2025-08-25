package ch13_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}

public class P12 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Allice", 9000),
                new Employee("Bob", 7500),
                new Employee("Carol", 8000),
                new Employee("Dave", 9500),
                new Employee("Eve", 7000),
                new Employee("Frank", 9500)
        );

        List<String> highSalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(n -> n.getName())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(highSalary);

    }
}
