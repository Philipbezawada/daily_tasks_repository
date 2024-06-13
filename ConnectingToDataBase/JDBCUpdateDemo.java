package ConnectingToDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/philip";
        String username = "root";
        String password = "root";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Product ID to update: ");
            int productId = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter New Price: ");
            double newPrice = scanner.nextDouble();

            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "UPDATE products SET price = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setInt(2, productId);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Product price updated successfully!");
            } else {
                System.out.println("No product found with ID " + productId);
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
