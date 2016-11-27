package com.katey2658.toes.entity;

/**
 * Created by 11456 on 2016/11/22.
 */
public class Teacher {
    /**
     * 无参构造
     */
    public Teacher(){
    }
    /**
     * 教师id
     */
    private String teacherId;
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }


    /**
     * 教师名
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 教师密码
     */
    private String teacherPwd;

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    /**
     * 教师邮箱
     */
    private String teacherMail;

    public String getTeacherMail() {
        return teacherMail;
    }

    public void setTeacherMail(String teacherMail) {
        this.teacherMail = teacherMail;
    }


    /**
     * 教师年龄
     */
    private int teacherAge;

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }


    /**
     * 性别
     */
    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    /**
     * 教师信息：地址
     */
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    /**
     * 是否在线
     */
    private boolean online;

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    /**
     * 账户是否可用，如果不可用，就是账户一般已经关闭
     */
    private boolean active;

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive(){
        return active;
    }


}
