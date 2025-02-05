import java.util.*;
public class LambdaExample {
    @FunctionalInterface
    interface StringProcessor {
        String process(String str);
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted List (Reverse Alphabetical Order): " + strings);

        StringProcessor toUpperCaseProcessor = (str) -> str.toUpperCase();
        List<String> uppercasedStrings = new ArrayList<>();
        for (String str : strings) {
            uppercasedStrings.add(toUpperCaseProcessor.process(str));
        }
        System.out.println("Uppercased Strings: " + uppercasedStrings);
    }
}
