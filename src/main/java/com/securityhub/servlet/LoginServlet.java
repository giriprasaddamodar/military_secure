package com.securityhub.servlet; 
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if ("admin@security.com".equals(email) && "admin123".equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", email);
            res.sendRedirect("dashboard");
        } else {
            res.sendRedirect("login.jsp?error=1");
        }
    }
}
