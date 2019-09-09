package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("")
public class Servlet extends HttpServlet {

    public final String name = "name";
    public String message = "message";
    public HttpSession sessionStart;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        sessionStart = session;
        Object resultAttribute = session.getAttribute("name");
        if (resultAttribute != null) {
            message = (String) resultAttribute;
        }
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = sessionStart;
        String answer = req.getParameter("name");
        req.setAttribute("message", answer);
        req.getRequestDispatcher("WEB-INF/welcome.jsp").forward(req, resp);
        
    }
}
