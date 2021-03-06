package by.it.Zyryanov.project_v2.java.controller;

import by.it.Zyryanov.project_v2.java.beans.Users;
import by.it.Zyryanov.project_v2.java.dao.DAO;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

public class CmdLogin extends Action {
    @Override
    public Action execute(HttpServletRequest request) {
        if (!Form.isPost(request)){
            return null;
        }
        else
        {
            Users user = new Users();
            user.setId(0);
            try {
                user.setLogin(Form.getString(request, "login", Pattern.LOGIN));
                user.setPassword(Form.getString(request, "password", Pattern.PASSWORD));
                DAO dao = DAO.getDao();
                String where = String.format("WHERE Login='%s' AND Password='%s'", user.getLogin(), user.getPassword());
                List<Users> list = dao.user.getAll(where);
                if (list.size()==1){
                    HttpSession session = request.getSession();
                    user=list.get(0);
                    session.setAttribute("user", user);
                    return Actions.PROFILE.command;
                } else{
                    request.setAttribute(Messages.MSG_MESSAGE, "Нет такого пользователя");
                    return null;
                }
            } catch (Exception e) {
                request.setAttribute(Messages.MSG_ERROR, e.toString());
                e.printStackTrace();
            }
            return null;
        }
    }
}

