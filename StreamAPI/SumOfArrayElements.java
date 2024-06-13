/*
 Write a Java program to create a stream of integers from an array and use the Stream API to find
  and print the sum of all elements.
 */

package StreamAPI;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of all elements: " + sum);
    }
}

