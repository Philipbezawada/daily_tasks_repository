/*
 Implement a Java program using HashMap to store and retrieve student names and their corresponding marks. 
 Print the names and marks of all students. 
 */


package Java_Features;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        for (String name : studentMarks.keySet()) {
            System.out.println("Name: " + name + ", Marks: " + studentMarks.get(name));
        }
    }
}

