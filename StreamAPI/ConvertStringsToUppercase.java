/*
  Write a Java program to create a stream of strings, convert each string to uppercase using the Stream API, 
  and collect the results into a new list.
 */

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> upperCaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());
        upperCaseStrings.forEach(System.out::println);
    }
}
