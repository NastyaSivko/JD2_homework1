package by.itacademy.web;

import by.itacademy.user.UserSalary;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.itacademy.utils.CalculatorSalary.*;
import static by.itacademy.web.WebUtils.forwardToJsp;


@WebServlet("/pageuser")
public class PageUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        forwardToJsp("pageUser", rq, rs);
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        String salary = rq.getParameter("salary");
        String tax = rq.getParameter("tax");
        if (salary == "" || tax == "") {
            rq.setAttribute("error", "Что-то не ввели");
            forwardToJsp("pageUser", rq, rs);
        }
        UserSalary newSalary = new UserSalary();
        newSalary.setSalary(Integer.parseInt(salary));
        newSalary.setTax(Integer.parseInt(tax));
        ctx.setAttribute("userSalary", newSalary);
        Integer fszn = calculatorPercent(Integer.parseInt(salary), Integer.parseInt(tax));
        Integer bgs = calculatorPercent(Integer.parseInt(salary), PERCENT_ONE);
        Integer pod = calculatorPercent(Integer.parseInt(salary), PERCENT_THIRTEEN);
        Integer prof = calculatorPercent(Integer.parseInt(salary), PERCENT_ONE);
        ctx.setAttribute("fszn", fszn);
        ctx.setAttribute("bgs", bgs);
        ctx.setAttribute("pod", pod);
        ctx.setAttribute("prof", prof);
        Integer salaryWithoutTax = getSalaryWithoutTax(Integer.parseInt(salary), Integer.parseInt(tax));
        ctx.setAttribute("salary", salaryWithoutTax);
        forwardToJsp( "salary", rq, rs);
    }
}
