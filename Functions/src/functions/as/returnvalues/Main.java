package functions.as.returnvalues;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Math myMath = new Math();

        BiFunction<String, Integer, String> concatner = myMath.getConcatner(true);
        System.out.println(concatner.apply("Dan", 37));

        System.out.println(myMath.getConcatner(false).apply("Varuni", 35));
    }
}
