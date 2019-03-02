package com.study.spring.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;


@Setter
@Getter
public class Sheep implements Serializable {

    private static final long serialVersionUID = 1288532020145351374L;

    @Value("${sheep.id}")
    private int id;

    @Value("${sheep.name}")
    private String name;

    @Value("${sheep.age}")
    private int age;

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
