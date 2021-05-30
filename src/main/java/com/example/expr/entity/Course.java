package com.example.expr.entity;

public class Course {
    private Long CID;
    private String CName;
    private String teacher;

    public Long getCID() {
        return CID;
    }

    public void setCID(Long CID) {
        this.CID = CID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
