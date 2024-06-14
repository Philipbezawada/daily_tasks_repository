package com.example.operations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.entity.User;
import com.example.util.HibernateUtil;

public class CRUDOperations {

    public static void createUser(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            session.save(user);

            transaction.commit();
            System.out.println("User created successfully with ID: " + user.getId());
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static User getUserById(Long userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            User user = session.get(User.class, userId);
            if (user != null) {
                System.out.println("User retrieved: " + user.getUsername());
            } else {
                System.out.println("User not found with ID: " + userId);
            }
            return user;
        } finally {
            session.close();
        }
    }

    public static void updateUser(Long userId, String newPassword) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            User user = session.get(User.class, userId);
            if (user != null) {
                user.setPassword(newPassword);
                session.update(user);

                transaction.commit();
                System.out.println("User updated successfully");
            } else {
                System.out.println("User not found with ID: " + userId);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void deleteUser(Long userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            User user = session.get(User.class, userId);
            if (user != null) {
                session.delete(user);

                transaction.commit();
                System.out.println("User deleted successfully");
            } else {
                System.out.println("User not found with ID: " + userId);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
