package com.securityhub.servlet;

import com.securityhub.dao.MessageDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sendMessage")
public class MessageServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        String message = req.getParameter("message");

        MessageDAO dao = new MessageDAO();
        dao.saveMessage("Admin", message);

        resp.sendRedirect("messages.jsp");
    }
}
