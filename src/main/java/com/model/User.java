package com.model;

public class User {
    private int id;
    private String userName;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    @Override
    public String toString(){
        return "User[id=" + id +",userName=" + userName +"]";
    }
}
