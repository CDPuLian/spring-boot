package com.my.boot.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 */
public class User implements Serializable {
    private static final long serialVersionUID = -58474338814965648L;

    private String userName;

    private String email;

    private String phoneNumber;

    private int type;

    private int usersId;

    private String location;


    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getType() {
        return type;
    }

    public int getUsersId() {
        return usersId;
    }

    public String getLocation() {
        return location;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type=" + type +
                ", usersId=" + usersId +
                ", location='" + location + '\'' +
                '}';
    }
}