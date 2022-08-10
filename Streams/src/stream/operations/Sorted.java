package stream.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("banana");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        System.out.println("Unsorted list : " + shoppingList);

        List<String> sortedList = shoppingList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted list : " + sortedList);

    }
}
