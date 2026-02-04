package com.x.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Task {
    private int taskId;
    private int userId;
    private String task;
    private String description;
    private String taskType;
    private Date deadline;
    private Timestamp createdAt;

    public Task() {
    }

    public Task(Timestamp createdAt, Date deadline, String description, String task, String taskType, int taskId, int userId) {
        this.createdAt = createdAt;
        this.deadline = deadline;
        this.description = description;
        this.task = task;
        this.taskType = taskType;
        this.taskId = taskId;
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
