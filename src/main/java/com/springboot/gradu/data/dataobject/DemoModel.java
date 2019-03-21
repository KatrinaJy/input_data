package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class DemoModel {
    private String name;
    private Integer age;

    public DemoModel() {

    }

    public DemoModel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
