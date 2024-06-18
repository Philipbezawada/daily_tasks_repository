package com.techm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        // Save a new student
        Student newStudent = new Student();
        newStudent.setStid(6);
        newStudent.setStname("Philip");
        studentDao.saveStudent(newStudent);

        // Get student by ID
        Student student = studentDao.getStudentById(1);
        if (student != null) {
            System.out.println("Retrieved Student: " + student.getStname());
            System.out.println();
        }

        // Get all students
        List<Student> students = studentDao.getAllStudents();
        if (students != null) {
            for (Student s : students) {
                System.out.println("Student: " + s.getStname());   
            }System.out.println();
        }

        // Update a student
//        if (student != null) {
//            student.setStname("John Smith");
//            studentDao.updateStudent(student);
//        }
//
//        // Delete a student
//        studentDao.deleteStudent(1);
    }
}
