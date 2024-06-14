import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String grade = request.getParameter("grade");

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGrade(grade);

        request.setAttribute("student", student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentDetails.jsp");
        dispatcher.forward(request, response);
    }
}
