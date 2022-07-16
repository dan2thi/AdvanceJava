package functions.tri;

public class Main {

    public static void main(String[] args) {

        // Note that the 4th generic type refers to the return type of the method 'apply()'
        TriFunction<Integer, Integer, Integer, Integer> myTriFunc1 = MyMathTri::functionWithThreeArgs; // 1 - Method reference

        TriFunction<Integer, Integer, Integer, Integer> myTriFunc2 = (x, y, z) -> x * y + z; // 2 - Lambda expression

        TriFunction<Integer, Integer, Integer, Integer> myTriFunc3 = new TriFunction<Integer, Integer, Integer, Integer>() { // 3 - Anonymous class instance
            @Override
            public Integer apply(Integer x, Integer y, Integer z) {
                return x * y + z;
            }
        };

        System.out.println(myTriFunc1.apply(3, 4, 5));
        System.out.println(myTriFunc2.apply(3, 4, 5));
        System.out.println(myTriFunc3.apply(3, 4, 5));

    }
}
