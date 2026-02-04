package com.x.model;

import java.sql.Timestamp;

public class User {
    private int userId;
    private String userName;
    private String email;
    private String name;
    private String password;
    private String bio;
    private String status;
    private Timestamp createdAt;

    public User() {
    }

    public User(String bio, Timestamp createdAt, String email, String name, String password, String status, int userId, String userName) {
        this.bio = bio;
        this.createdAt = createdAt;
        this.email = email;
        this.name = name;
        this.password = password;
        this.status = status;
        this.userId = userId;
        this.userName = userName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
