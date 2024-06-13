/*
 Implement a Java program that uses JDBC to delete a record from a table named orders. 
 Prompt the user to enter the order id to be deleted from the database. 
 */

package ConnectingToDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDeleteDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/philip";
        String username = "root";
        String password = "root";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Order ID to delete: ");
            int orderId = scanner.nextInt();

            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM orders WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, orderId);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Order with ID " + orderId + " deleted successfully!");
            } else {
                System.out.println("No order found with ID " + orderId);
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

