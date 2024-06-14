package HQL_queries;



import org.hibernate.Session;
import org.hibernate.Transaction;
import com.techm.entity.User;
import com.techm.Util.HibernateUtil;

public class InsertQuery {
    public static void main(String[] args) {
        // Get session from Hibernate utility
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Begin transaction
        Transaction transaction = session.beginTransaction();
        
        // Create new user instance
        User newUser = new User();
        newUser.setUsername("newuser1");
        newUser.setPassword("password1234");
        
        // Save the user
        session.save(newUser);
        
        // Commit the transaction
        transaction.commit();
        // Close the session
        session.close();
        
        System.out.println("User inserted successfully");
    }
}
