package com.telusko.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users
{
    @Id
    private String name;
    private String password;

    @Override
    public String toString() {
        return super.toString();
    }
    public Users()
    {

    }
    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;

    }

}
