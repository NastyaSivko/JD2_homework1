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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forwardToJsp("login", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
            ServletContext ctx = getServletContext();
            String name = rq.getParameter("name");
            String surname = rq.getParameter("surname");
            String login = rq.getParameter("login");
            String password = rq.getParameter("password");

            Users newUser = new Users();

            newUser.setName(name);
            newUser.setSurname(surname);
            newUser.setLogin(login);
            newUser.setPassword(password);

            ctx.setAttribute("user", newUser);

            boolean res = LoginUsers.addUser(newUser);

            if (login == "" && password == ""){
                forwardToJsp("login", rq, rs);
            }
            if (res) {
                forwardToJsp("signup", rq, rs);
            } else if (login == "" || password == "") {
                    rq.setAttribute("error", "Некорректный логин или пароль");
                    forwardToJsp("login", rq, rs);
                } else {
                rq.setAttribute("error", "Такой пользователь уже существует");
                forwardToJsp("login", rq, rs);
                }
        }
}
