package stream.operations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {

    private static String[] words = {"hello", "world", "functional", "programming", "is",  "cool", "hello", "world"};
    private static List<String> wordList = Arrays.asList(words);
    private static Set<String> wordSet = new HashSet<>(wordList);

    public static void main(String[] args) {
        toList();
        toSet();
        toMap();
        toJoinedString();
        wordsGreaerThanFiveCharacters();
        groupingBy();
        partitioningBy();


    }

    static void toList() {
        List<String> duplicateWordList = wordList.stream().collect(Collectors.toList());
        System.out.println("toList : " + duplicateWordList);
    }

    static void toSet() {
        Set<String> wordSet = wordList.stream().collect(Collectors.toSet());
        System.out.println("toSet : " + wordSet);

    }

    private static void toMap() {
        Function<String, String> keyFunction = (word) -> word.toUpperCase();
        Function<String, Integer> valueFunction = (word) -> word.length();
        Map<String, Integer> upperCaseToLengthMap = wordSet.stream()
                                                        .collect(Collectors.toMap(keyFunction, valueFunction));
        System.out.println("toMap : " + upperCaseToLengthMap);
    }

    private static void toJoinedString() {
        String joinedString = wordList.stream().collect(Collectors.joining("|"));
        System.out.println("Joined String : " + joinedString);
    }

    private static void wordsGreaerThanFiveCharacters() {
        Long result = wordList.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.counting());
        System.out.println("Words greater than 5 characters = " + result);
    }

    private static void groupingBy() {
        Map<Integer, List<String>> result = wordList.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println("groupingBy : " + result);
    }

    private static void partitioningBy() {
        Map<Boolean, List<String>> result = wordList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println("partitioningBy : " + result);
    }
}
