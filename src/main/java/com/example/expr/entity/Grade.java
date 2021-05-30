package com.example.expr.entity;

public class Grade {
    private Long SID;
    private Long CID;
    private int score;
    private String note;

    public Long getSID() {
        return SID;
    }

    public void setSID(Long SID) {
        this.SID = SID;
    }

    public Long getCID() {
        return CID;
    }

    public void setCID(Long CID) {
        this.CID = CID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
