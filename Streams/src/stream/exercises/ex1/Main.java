package stream.exercises.ex1;

import stream.exercises.Car;
import stream.exercises.Employee;
import stream.exercises.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // 1) Get a list that contains all the people's names
            getAllPeopleNames();

        // 2) Get a list of blue cars
            getBlueCars();

        // 3) Find the sum of all of the employees' salaries
            getSumOfSalaries();

    }

    private static void getAllPeopleNames() {
        List<String> peopleNames = Person.getPersonList().stream()
                                                         .map(person -> person.name)
                                                         .collect(Collectors.toList());
        System.out.println("All person names : " + peopleNames);
    }

    private static void getBlueCars() {
        List<Car> blueCars = Car.getCarList().stream()
                                             .filter(car -> car.color.equals("blue"))
                                             .collect(Collectors.toList());
        System.out.println("Blue cars : " + blueCars);
    }

    private static void getSumOfSalaries() {
        Optional<Float> sum = Employee.getEmployeeList().stream()
                                             .map(employee -> employee.salary)
                                             .reduce((acc, salary) -> acc + salary);
        System.out.println("Salary sum = " + sum.orElse(0f));
    }
}
