package com.techm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentDao studentDao = (StudentDao) context.getBean("dao");

        // Save a new student
        Student newStudent = new Student();
        newStudent.setStid(1);
        newStudent.setStname("John Doe");
        studentDao.saveStudent(newStudent);

        // Get student by ID
        Student student = studentDao.getStudentById(1);
        System.out.println("Retrieved Student: " + student.getStname());

        // Get all students
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
            System.out.println("Student: " + s.getStname());
        }

        // Update a student
        student.setStname("John Smith");
        studentDao.updateStudent(student);

        // Delete a student
        studentDao.deleteStudent(100);
    }
}
