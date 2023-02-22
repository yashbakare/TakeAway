package com.elevate.app.takeaway.model;

import javax.validation.constraints.NotEmpty;

public class LoginModel {
    @NotEmpty(message = "UserName Is Require")
    private String username;
    @NotEmpty(message = "Password Is Require")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
