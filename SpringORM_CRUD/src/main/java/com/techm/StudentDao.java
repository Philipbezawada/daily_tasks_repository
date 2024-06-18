package com.techm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }

    @Transactional
    public Student getStudentById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    @Transactional
    public void updateStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.update(student);
    }

    @Transactional
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.byId(Student.class).load(id);
        session.delete(student);
    }
}
