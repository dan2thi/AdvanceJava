package functions.as.args;

public class Main {
    public static void main(String[] args) {
        Math myMath = new Math();

        // (1) - case : double the value function
        Integer case1 = myMath.applyWith(4, (x) -> x * 2);

        // (2) - case : power to the 2 value function
        Integer case2 = myMath.applyWith(6, (x) -> x * x);

        // (3) - case : modulus of 5 value function
        Integer case3 = myMath.applyWith(8, (x) -> x % 5);

        System.out.println(case1);
        System.out.println(case2);
        System.out.println(case3);

        //////////////////////////////////////////////////

        // (4) case : sum of two values are doubled
        Integer case4 = myMath.applyWith(4, 6, (x, y) -> 2 * (x + y));

        // (5) case : multiplied result's modulus of 3
        Integer case5 = myMath.applyWith(7, 8, (x, y) -> (x * y) % 3);

        System.out.println(case4);
        System.out.println(case5);
    }
}
