package com.techm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        // Save a new student
        Student newStudent = new Student();
        newStudent.setId(1);
        newStudent.setName("Philip");
        studentDao.saveStudent(newStudent);

        // Get student by ID
        Student student = studentDao.getStudentById(1);
        System.out.println("Retrieved Student: " + student.getName());

        // Update a student
        student.setName("John");
//        studentDao.updateStudent(student);

        // Delete a student
        //studentDao.deleteStudent(1);
        
    }
}
