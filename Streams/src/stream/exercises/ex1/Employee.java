package stream.exercises.ex1;

import java.util.Arrays;
import java.util.List;

public class Employee {

    String name;
    Integer age;
    String jobTitle;
    Float salary;

    public Employee(String name, Integer age, String jobTitle, Float salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    static List<Employee> getEmployeeList() {
        Employee[] employees = {
                new Employee("John", 34, "developer", 45000f),
                new Employee("Hannah", 24, "developer", 35000f),
                new Employee("Bart", 50, "sales executive", 55000f),
                new Employee("Sophie", 49, "construction worker", 55000f),
                new Employee("Darren", 38, "writer", 65000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };

        return Arrays.asList(employees);

    }

}
