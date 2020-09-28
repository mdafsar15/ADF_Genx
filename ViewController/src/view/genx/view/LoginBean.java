package view.genx.view;

import javax.faces.context.FacesContext;

import javax.security.auth.Subject;

import javax.security.auth.login.LoginException;

import javax.servlet.http.HttpServletRequest;


import weblogic.security.URLCallbackHandler;
import weblogic.security.services.Authentication;

import weblogic.servlet.security.ServletAuthentication;

public class LoginBean {
    
    private String _username, _password;


    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getUsername() {
        return _username;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getPassword() {
        return _password;
    }
    
    public String doLogin(){
        
        String un = _username;
        byte[] pw = _password.getBytes();
        
        FacesContext ctx = FacesContext.getCurrentInstance();
       HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
        Subject mySubject;
        try {
             mySubject = Authentication.login(new URLCallbackHandler(un, pw));
//            ServletAuthentication.runAs(mySubject, request);
        } catch (LoginException e) {
        }

        return null;
    }
}
