package functions.as.args;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Math {
    /**
     * This method takes and x integer and feed into the myFunc function and return the returned value of myFunc
     * @param x given value
     * @param myFunc function to be fed x into
     * @return return value of myFunc function
     */
    public Integer applyWith(Integer x, Function<Integer, Integer> myFunc) {
        return myFunc.apply(x);
    }

    /**
     * This method takes integer x and integer y and feed into the myBiFunc and return the returned value of myBiFunc
     * @param x given value
     * @param y given value
     * @param myBiFunc function to be fed x and y into
     * @return return value of myBiFunc
     */
    public Integer applyWith(Integer x, Integer y, BiFunction<Integer, Integer, Integer> myBiFunc) {
        return myBiFunc.apply(x, y);
    }
}
