package functions.function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Note that 2nd generic type in declaration refers to the return type of the 'apply()' method
        Function<Integer, Integer> myMath1 = MyMath::triple; // 1 - Method reference
        Function<Integer, Integer> myMath2 = (x) -> MyMath.triple(x); // 2 - Lambda expression

        Function<Integer, Integer> myMath3 = new Function<Integer, Integer>() { // 3 - Anonymous class
            @Override
            public Integer apply(Integer integer) {
                return MyMath.triple(integer);
            }
        };

        System.out.println(myMath1.apply(4));
        System.out.println(myMath2.apply(4));
        System.out.println(myMath3.apply(4));

    }

    /*
        - All above 3 ways are same implementation
        - (1) needs to be understood as, that method reference (i.e ::) returns an implementation of Function<T, U> interface
     */

}
