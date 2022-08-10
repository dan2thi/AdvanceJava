package stream.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreator {

    public static void main(String[] args) {
        // there are few ways of creating streams

        // 1) Using Stream interface
        Stream<String> letterStream = Stream.of("a", "b", "c");

        // 2) Using Arrays class
        Integer[] scores = {80, 34, 64, 32};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        // 3) Calling stream() method on Lists
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("banana");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shoppingListStream = shoppingList.stream();


    }
}
