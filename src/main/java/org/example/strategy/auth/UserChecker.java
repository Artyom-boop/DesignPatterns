package org.example.strategy.auth;

import org.example.strategy.strategy.AuthStrategy;

public class UserChecker {
    private String login;
    private String password;
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(login, password);
    }
}
