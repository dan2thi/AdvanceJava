package composition;

import java.util.Arrays;
import java.util.function.Function;

public class Main2 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 34, "Developer", 80000f),
                new Employee("Hannah", 24, "Developer", 45000f),
                new Employee("Bart", 50, "Sales Executive", 100000f),
                new Employee("Sophie", 49, "Construction Worker", 40000f),
                new Employee("Darren", 38, "Writer", 50000f),
                new Employee("Nancy", 29, "Developer", 75000f)
        };

        Function<Employee, String> reverse = x -> new StringBuilder(x.getName()).reverse().toString();
        Function<String, String> upperCase = x -> x.toUpperCase();

        Function<Employee, String> reverseAndUpperCase = reverse.andThen(upperCase);

        Arrays.stream(employees)
                .map(reverseAndUpperCase)
                .forEach(System.out::println);
    }
}
