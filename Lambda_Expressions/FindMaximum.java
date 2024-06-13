package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 30, 25);
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println("Maximum element: " + max);
    }
}
