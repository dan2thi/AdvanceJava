package composition;

import java.util.Arrays;
import java.util.function.Function;

public class Main1 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", 34, "Developer", 80000f),
            new Employee("Hannah", 24, "Developer", 45000f),
            new Employee("Bart", 50, "Sales Executive", 100000f),
            new Employee("Sophie", 49, "Construction Worker", 40000f),
            new Employee("Darren", 38, "Writer", 50000f),
            new Employee("Nancy", 29, "Developer", 75000f)
        };


        Function<Integer, Integer> timesTwo = x -> 2 * x;
        Function <Integer, Integer> minusOne = x -> x - 1;

        String s = "apple";
        System.out.println(new StringBuilder(s).reverse());

    // Compose single function using above two functions - In order to combine, first function's return type should
    // match with the second function's argument type - Two ways doing this
    // 1) Use 'compose' method - this will be applied in reverse order (eg: first it will be applied 'timesTwo' then 'minusOne')
        Function<Integer, Integer> timesTwoMinusOne = minusOne.compose(timesTwo);

    // 2) Use 'andThen' method
        Function<Integer, Integer> combined = timesTwo.andThen(minusOne);

    // Apply combined function for each employee's age and print out the figures
        Arrays.stream(employees)
                .map(e -> combined.apply(e.getAge()))
                .forEach(System.out::println);

    }

}
