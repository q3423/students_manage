package com.lm.manage.domain;

import org.springframework.data.annotation.Id;

/**
 *@Title: Dog
 *@Author:LiMan
 *@Date:2018/3/6 9:44
 *@Description: 
 */
public class Dog {
    @Id
    private String id;
    private Integer age;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
