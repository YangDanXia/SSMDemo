package com.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String userName;

    private static final long serialVersionUID = 1L;

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User() {
        super();
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

    public String toString(){
        return "User[id=" + id + ",userName=" + userName +"]";
    }
}