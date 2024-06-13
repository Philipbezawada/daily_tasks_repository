/*
 Implement a Java program that uses the Stream API to find and print the maximum element from a list of integers.
 */



package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 30, 25);
        int max = numbers.stream()
                         .max(Integer::compare)
                         .orElseThrow();
        System.out.println("Maximum element: " + max);
    }
}

