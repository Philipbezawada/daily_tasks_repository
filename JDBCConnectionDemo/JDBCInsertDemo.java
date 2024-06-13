/*
 Implement a Java program that uses JDBC to insert a new record into a table named students. Prompt the user to enter student details (id, name, age) 
 and insert them into the database. 
 */

package JDBCConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/philip";
        String username = "root";
        String password = "root";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();

            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
