package by.it.psmishenko.project.java.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 05.05.2017.
 */
public class FrontController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Action action = Actions.defineFrom(req);
        action.execute(req);
        dispatcher(action).forward(req,resp);
    }
private RequestDispatcher dispatcher(Action action){
      return  getServletContext().getRequestDispatcher(action.getJSP());
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Action action = Actions.defineFrom(req);
        Action nextAction = action.execute(req);
        if(nextAction!=null){
            resp.sendRedirect("do?command="+nextAction);
        } else {
            dispatcher(action).forward(req,resp);
        }
    }
    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    /*    ServletContext servletContext = getServletContext();
        RequestDispatcher disp =  servletContext.getRequestDispatcher("/index.jsp");
        disp.forward(req,resp);*/
    }
}
