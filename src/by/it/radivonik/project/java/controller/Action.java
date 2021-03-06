package by.it.radivonik.project.java.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Radivonik on 06.05.2017.
 */
public abstract class Action {
    abstract Action execute(HttpServletRequest req);

    @Override
    public String toString() {
        String name = this.getClass().getSimpleName();
        name = name.replace("Command","");
        return name;
    }

    public String getJsp() {
        return "/" + this.toString().toLowerCase() + ".jsp";
    }
}
