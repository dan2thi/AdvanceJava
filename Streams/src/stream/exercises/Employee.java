package stream.exercises;

import java.util.Arrays;
import java.util.List;

public class Employee {

    public String name;
    public Integer age;
    public String jobTitle;
    public Float salary;

    public Employee(String name, Integer age, String jobTitle, Float salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public static List<Employee> getEmployeeList() {
        Employee[] employees = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };

        return Arrays.asList(employees);

    }

}
