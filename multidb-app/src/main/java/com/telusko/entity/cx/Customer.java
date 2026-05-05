package com.telusko.entity.cx;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer
{
    @Id
    private Long cid;

    private String name;

    private String city;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
    }


}

