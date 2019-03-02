package com.study.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by liujiatai on 2019/3/1.
 */

@Setter
@Getter
@Component
public class Person implements Serializable{

    private static final long serialVersionUID = -4328818995465808287L;

    private int id;

    private String name;

    private int age;

    private Car car;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
