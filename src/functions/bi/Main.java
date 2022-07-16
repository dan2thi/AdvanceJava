package functions.bi;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        // Note that 3rd generic type in declaration refers to the return type of the 'apply()' method
        BiFunction<Integer, Integer, Integer> myBiFunc2 = MyMathBi::multiply; // 1 - Method reference

        BiFunction<Integer, Integer, Integer> myBiFunc1 = (x, y) -> x * y; // 2 - Lambda expression

        BiFunction<Integer, Integer, Integer> myBiFunc3 = new BiFunction<Integer, Integer, Integer>() { // 3 - Anonymous class instance
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        };

        System.out.println(myBiFunc1.apply(3, 5));
        System.out.println(myBiFunc2.apply(3, 5));
        System.out.println(myBiFunc3.apply(3, 5));

    }
}
