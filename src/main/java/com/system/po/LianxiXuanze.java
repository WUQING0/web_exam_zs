package com.system.po;

public class LianxiXuanze {
    private Integer lianxiId;

    private String lianxiName;

    private Integer teacherId;

    private String teacherName;

    private String answerA;

    private String answerB;

    private String answerC;

    private String answerD;

    private String answer;

    private String type;

    public Integer getLianxiId() {
        return lianxiId;
    }

    public void setLianxiId(Integer lianxiId) {
        this.lianxiId = lianxiId;
    }

    public String getLianxiName() {
        return lianxiName;
    }

    public void setLianxiName(String lianxiName) {
        this.lianxiName = lianxiName == null ? null : lianxiName.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA == null ? null : answerA.trim();
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB == null ? null : answerB.trim();
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC == null ? null : answerC.trim();
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD == null ? null : answerD.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}