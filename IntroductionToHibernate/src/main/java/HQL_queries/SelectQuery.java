package HQL_queries;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.techm.Util.HibernateUtil;
import com.techm.entity.User;

import java.util.List;

public class SelectQuery {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query<User> query = session.createQuery("FROM User", User.class);
        List<User> users = query.getResultList();
        
        for (User user : users) {
            System.out.println("User: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        }
        
        session.close();
    }
}

