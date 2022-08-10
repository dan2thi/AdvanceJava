package stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {

    /*
        - reduce() takes a BinaryOperator<T> with or without a starting value
        - BinaryOperator is a function which takes same type two args and return the same type (eg: (acc, x) -> acc + x)
        - First argument in the BinaryOperator is called the accumulator
        - Return value of the each iteration of the function is assigned to accumulator when called in for the next iteration
        - If you pass in a starting value to reduce(), that will be assigned to the the accumulator for the first iteration
        - If you don't pass in a starting value, acc will be the first element and x will be the second element for the first iteration
        - In other words, if you pass in a starting value, reduce() will iterate through n times where the n is the number of elements in the stream
        - If you dont pass in a starting value it will iterate through n-1 times
        - Also if you pass in a starting value reduce() will return T type where T is the type of the elements in the stream
        - If you do not pass in a starting value reduce() will return Optional<T>




     */

    public static void main(String[] args) {
        reduceForSum();
        reduceForConcat();
    }


    static void reduceForSum() {
        System.out.println("\nExecuting reduceForSum()...");
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> sum = (acc, x) -> {
            int result = acc + x;
            System.out.println("acc=" + acc + ", x="+ x + ", result=" + result);
            return result;
        };
        System.out.println("Calculating result1");
        Optional<Integer> result1 = intList.stream().reduce(sum);
        System.out.println("\nCalculating result2");
        Integer result2 = intList.stream().reduce(0, sum);

        System.out.println("\nresult1 = " + result1.orElse(0));
        System.out.println("result2 = " + result2);
    }

    static void reduceForConcat() {
        System.out.println("\nExecuting reduceForConcat()...");
        String[] words = {"I", "Love", "Java", "Streams"};
        List<String> wordsList = Arrays.asList(words);
        Optional<String> result1 = wordsList.stream().reduce((acc, word) -> acc.concat(" " + word));
        String result2 = wordsList.stream().reduce("", (acc, word) -> acc.concat(" " + word));
        System.out.println("result1 = " + (result1.orElse(null)));
        System.out.println("result2 = " + result2.trim());

    }
}
