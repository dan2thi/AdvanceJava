package stream.exercises;

import java.util.Arrays;
import java.util.List;

public class Car {

   public String make;
   public String color;
   public Float price;

    public Car(String make, String color, Float price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public static List<Car> getCarList() {
        Car[] cars = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f)
        };

        return Arrays.asList(cars);
    }
}
