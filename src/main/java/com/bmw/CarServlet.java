
package com.bmw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cars")
public class CarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<h1>Welcome to BMW Car Showroom</h1>"
        );

        response.getWriter().println(
            "<h2>Available BMW Models</h2>"
        );

        response.getWriter().println("<p>BMW 3 Series</p>");
        response.getWriter().println("<p>BMW 5 Series</p>");
        response.getWriter().println("<p>BMW X5</p>");
    }
}
