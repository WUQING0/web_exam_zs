package com.system.po;

public class LianxiDati {
    private Integer lianxiId;

    private String lianxiName;

    private Integer teacherId;

    private String teacher;

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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
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