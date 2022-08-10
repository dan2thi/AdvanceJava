package stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

    private static String[] words = {"hello", "world", "functional", "programming", "is",  "cool", "hello", "world"};
    static List<String> wordList = Arrays.asList(words);

    public static void main(String[] args) {
        toList();
        toSet();
        toJoinedString();
        wordsGreaerThanFiveCharacters();
        groupingBy();
        partitioningBy();


    }

    static void toList() {
        List<String> duplicateWordList = wordList.stream().collect(Collectors.toList());
        System.out.println(duplicateWordList);
    }

    static void toSet() {
        Set<String> wordSet = wordList.stream().collect(Collectors.toSet());
        System.out.println(wordSet);

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
