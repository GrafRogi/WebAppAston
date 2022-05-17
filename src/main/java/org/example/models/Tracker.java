package org.example.models;

import java.util.Date;

/**
 * @author Igor Gorokh
 */

public class Tracker {

    private int id;
    private String taskName;
    private String taskDescription;
    private String studentName;
    private String timeSpent;
    private Date createDate;

    public Tracker(){

    }

    public Tracker(int id, String taskName, String taskDescription, String studentName, String timeSpent, Date createDate) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.studentName = studentName;
        this.timeSpent = timeSpent;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}

