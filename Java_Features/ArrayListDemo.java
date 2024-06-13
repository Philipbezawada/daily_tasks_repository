/*
 Write a Java program to demonstrate the use of ArrayList. Add elements of different data types 
 (e.g., integer, string) to the list and print them.
 */


package Java_Features;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(42);
        list.add("Hello, World!");
        list.add(3.14);

        for (Object element : list) {
            System.out.println(element);
        }
    }
}
