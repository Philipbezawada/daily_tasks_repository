package com.techm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techm.config.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
      
     StudentDao dao =  context.getBean(StudentDao.class);
     
     int x = dao.saveStudent(new Student(102,"Mathew"));
     System.out.println(x + " row(s) inserted.");
     
//    int rowsDeleted = dao.deleteStudent("lakshmi"); // Replace with appropriate ID
//
//     System.out.println(rowsDeleted + " row(s) deleted");
    }
}