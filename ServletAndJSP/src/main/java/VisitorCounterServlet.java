import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VisitorCounterServlet extends HttpServlet {
    private static int visitorCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        synchronized (this) {
            visitorCount++;
        }
        request.setAttribute("visitorCount", visitorCount);
        RequestDispatcher dispatcher = request.getRequestDispatcher("visitorCount.jsp");
        dispatcher.forward(request, response);
    }
}
