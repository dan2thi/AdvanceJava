package stream.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapFilter {

    private static List<String> shoppingList;

    static {  shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("banana");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
    }
    public static void main(String[] args) {

        getItemsWhichStartWithC();
        getItemsGreaterThan5();
        getUpperCaseList();
        getItemsGreaterThanMinLength();

    }

    static void  getItemsWhichStartWithC(){
        List<String> itemsWhichStartWithC = shoppingList.stream()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println("itemsWhichStartWithC : " + itemsWhichStartWithC);
    }

    static void getItemsGreaterThan5() {
        List<String> ret = shoppingList.stream()
                .filter(item -> item.length() > 5)
                .collect(Collectors.toList());
        System.out.println("items with greater than 5 characters : " + ret);
    }

    static void getUpperCaseList() {
        System.out.println("items after upper casing : ");
        shoppingList.stream()
                .map(x -> x.toUpperCase())
                .forEach(System.out::println);
    }

    static void getItemsGreaterThanMinLength() {
        Function<Integer, Predicate<String>> minLengthValidator = (minLength) -> (str) -> str.length() > minLength;

        System.out.println("getting items with greater than 4 characters : ");
        shoppingList.stream()
                .filter(minLengthValidator.apply(4))
                .forEach(System.out::println);
        System.out.println("getting items with greater than 6 characters : ");
        shoppingList.stream()
                .filter(minLengthValidator.apply(6))
                .forEach(System.out::println);

    }
}
