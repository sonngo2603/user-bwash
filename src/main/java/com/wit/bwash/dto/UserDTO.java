package com.wit.bwash.dto;

import java.sql.Time;

public class UserDTO {
    private String nameUser;
    private String phoneUser;
    private String localUser;
    private Time timeUser;
    private String requestUser;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getLocalUser() {
        return localUser;
    }

    public void setLocalUser(String localUser) {
        this.localUser = localUser;
    }

    public Time getTimeUser() {
        return timeUser;
    }

    public void setTimeUser(Time timeUser) {
        this.timeUser = timeUser;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }
}
