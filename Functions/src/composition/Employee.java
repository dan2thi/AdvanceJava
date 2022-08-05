package composition;

public class Employee {

    private final String name;
    private final Integer age;
    private final String jobTitle;
    private final Float salary;

    public Employee(String name, Integer age, String jobTitle, Float salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Float getSalary() {
        return salary;
    }
}
