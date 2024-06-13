package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

public class PrintUpperCaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        strings.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
