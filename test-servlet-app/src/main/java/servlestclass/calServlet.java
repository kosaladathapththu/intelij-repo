package servlestclass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/cal")
public class calServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int total = num1 + num2;

        PrintWriter out = resp.getWriter();
        out.println("<html><body style='text-align:center; font-family:Arial;'>");
        out.println("<h1>✨ Result ✨</h1>");
        out.println("<p>Num1: " + num1 + "</p>");
        out.println("<p>Num2: " + num2 + "</p>");
        out.println("<h2>Total = " + total + "</h2>");
        out.println("</body></html>");
    }
}
