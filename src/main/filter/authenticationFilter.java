package main.filter;

@WebFilter({"/dashboard","/messages","/officers","/security"})
public class AuthenticationFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("user") != null) {
            chain.doFilter(req, res);
        } else {
            ((HttpServletResponse) res).sendRedirect("login.jsp");
        }
    }
}

