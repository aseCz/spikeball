package com.asecz.mavenproject1;

import java.util.Date;
import java.util.List;
import javafx.event.Event;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginBean")
@RequestScoped
public class loginBean {

    private String login;
    private String text;
    
    public loginBean() {
    }

    public String log_in() {
        text = login + "\n" + Math.random();
        return "index";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
