package stream.create;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        // 4) Calling stream() method on EntrySet on a Map
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "bat");
        map.put(5, "hello");
        map.put(6, "world!");
        Stream<Map.Entry<Integer, String>> stream = map.entrySet().stream();



    }
}
