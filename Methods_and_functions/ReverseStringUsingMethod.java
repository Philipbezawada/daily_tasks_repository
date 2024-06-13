package Methods_and_functions;
import java.util.Scanner;

public class ReverseStringUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
