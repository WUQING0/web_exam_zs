package com.system.po;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private String teacherPwd;

    private String role;

    private String teachCourse;

    private String teachId;

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

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd == null ? null : teacherPwd.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(String teachCourse) {
        this.teachCourse = teachCourse == null ? null : teachCourse.trim();
    }

    public String getTeachId() {
        return teachId;
    }

    public void setTeachId(String teachId) {
        this.teachId = teachId == null ? null : teachId.trim();
    }
}