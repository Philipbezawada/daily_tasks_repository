/*
 write one java program which shows the diffrence between Statement and PreparedStatement 
 */



package SQLQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StatementVsPreparedStatementExample {
    // JDBC database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/philip";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            // Example using Statement
            System.out.println("Example using Statement:");
            System.out.print("Enter department name to fetch employees: ");
            String departmentName = scanner.nextLine();

            // Using Statement to execute a query without parameters
            Statement statement = connection.createStatement();
            String sqlStatement = "SELECT * FROM employees WHERE department='" + departmentName + "'";
            ResultSet resultSet = statement.executeQuery(sqlStatement);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            resultSet.close();
            statement.close();

            // Example using PreparedStatement
            System.out.println("\nExample using PreparedStatement:");
            System.out.print("Enter department name to fetch employees: ");
            departmentName = scanner.nextLine();

            // Using PreparedStatement to execute a parameterized query
            String sqlPreparedStatement = "SELECT * FROM employees WHERE department=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlPreparedStatement);
            preparedStatement.setString(1, departmentName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

