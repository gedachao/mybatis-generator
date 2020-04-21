package com.kong.mybatis.model;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer personid;

    private String name;

    private String address;

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "Person{" +
                "personid=" + personid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}