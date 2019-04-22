package com.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String userName;

    private static final long serialVersionUID = 1L;

    public User(){}

    public User(String userName){
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}