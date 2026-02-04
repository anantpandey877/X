package com.x.model;

import java.sql.Timestamp;

public class Friend {
    private int requesterId;
    private int receiverId;
    private String status;
    private Timestamp createdAt;

    public Friend() {
    }

    public Friend(Timestamp createdAt, int receiverId, int requesterId, String status) {
        this.createdAt = createdAt;
        this.receiverId = receiverId;
        this.requesterId = requesterId;
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(int requesterId) {
        this.requesterId = requesterId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
