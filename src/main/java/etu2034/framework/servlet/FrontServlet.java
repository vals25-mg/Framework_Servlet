package etu2034.framework.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class FrontServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + request.getContextPath() + "</h1>");
        out.println("<h1>" + request.getServletPath() + "</h1>");
//        out.println("<p>" + request.getPathTranslated() + "</p>");
//        out.println("<p>" + request.getPathInfo() + "</p>");
//        out.println("<p>" + request.getServerName() + "</p>");
//        out.println("<p>" + request + "</p>");
        out.println("</body></html>");
//        Split like codeigniter
    }

    public void destroy() {
    }
}