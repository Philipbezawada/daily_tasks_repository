package Lambda_Expressions;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsDescending {
    public static void main(String[] args) {
        String[] strings = { "banana", "apple", "cherry", "date" };
        Arrays.sort(strings, (a, b) -> b.compareTo(a));
        System.out.println("Sorted strings in descending order: " + Arrays.toString(strings));
    }
}

