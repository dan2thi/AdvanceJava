package functions.as.data;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Math math = new Math();

        Function<Float, Float> doubleIt = math::doubleVal;
        BiFunction<Integer, Integer, Integer> add = math::add;
        BiFunction<Integer, Integer, Integer> substract = math::substract;

        System.out.println(doubleIt.apply(5.8f));
        System.out.println(add.apply(4, 8));
        System.out.println(substract.apply(7, 4));
    }
}
