package by.itacademy.web;

import by.itacademy.user.LoginUsers;
import by.itacademy.user.Users;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.itacademy.web.WebUtils.forwardToJsp;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        rq.getSession().getAttribute("authUser");
        forwardToJsp("signup", rq, rs);
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String login = rq.getParameter("login");
        String password = rq.getParameter("password");
        LoginUsers user = LoginUsers.findUser(login);

        if (login == "" && password == ""){
            forwardToJsp("signup", rq, rs);
        }

        if (user == null){
            rq.setAttribute("error", "Вы не зарегистрировались");
            forwardToJsp("signup", rq, rs);
        } else {
            if
            (!user.getPassword().equals(password)){
                rq.setAttribute("error", "Неправильный пароль");
                forwardToJsp("signup", rq, rs);
            } else {
                rq.setAttribute("users", user);
                forwardToJsp("pageUser", rq, rs);
            }
        }
    }
}
