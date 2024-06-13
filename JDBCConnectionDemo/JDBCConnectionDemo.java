/*
 Write a Java program to establish a connection to a MySQL database using JDBC. 
 Retrieve and print the records from a table named employees.
 * */


package JDBCConnectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/philip";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

