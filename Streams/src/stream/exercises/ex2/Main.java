package stream.exercises.ex2;

import stream.exercises.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // get a map of job title to average salary of that job title as following
        /*
            {
                "construction worker" = 40000,
                "developer" = 83333.336,
                "writer" = 50000,
                "sales executive" = 100000
            }
         */

        Map<String, Float> result = Employee.getEmployeeList().stream()
                                  .collect(Collectors.groupingBy(e -> e.jobTitle))
                                  .entrySet().stream()
                                  .collect(Collectors.toMap(
                                          entry -> entry.getKey(),
                                          entry -> {
                                              List<Employee> emps = entry.getValue();
                                              int count = emps.size();
                                              Float sumOfSalary = emps.stream().map(e -> e.salary).reduce(0f ,(acc, salary) -> acc + salary);
                                              return sumOfSalary / count;
                                          }
                                  ));
        System.out.println(result);
    }
}
