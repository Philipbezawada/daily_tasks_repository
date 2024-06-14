package HQL_queries;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.techm.Util.HibernateUtil;

public class UpdateQuery {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Query query = session.createQuery("UPDATE User SET password = :password WHERE username = :username");
        query.setParameter("password", "password123");
        query.setParameter("username", "newuser");
        int result = query.executeUpdate();
        
        transaction.commit();
        session.close();
        
        System.out.println("Rows affected: " + result);
    }
}

