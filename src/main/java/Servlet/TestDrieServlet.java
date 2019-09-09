package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/testdrie")
public class TestDrieServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        if (session.isNew()) {
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        } else if (!session.isNew()) {
            req.getRequestDispatcher("WEB-INF/welcome.jsp").forward(req, resp);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String givenName = req.getParameter("name");

        String invalid = "gelieve een geldige naam in te voeren!";
        if (givenName=="") {
            session.setAttribute("responce", invalid);
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        } else {
            session.setAttribute("responce", "");
            session.setAttribute("message", givenName);
            req.getRequestDispatcher("WEB-INF/welcome.jsp").forward(req, resp);
        }

        if (req.getParameter("logout").equals("logout")) {
            session.invalidate();
            System.out.println("logout is called");
            resp.sendRedirect("testdrie");


        }


    }
}
