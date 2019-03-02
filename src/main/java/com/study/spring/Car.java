package com.study.spring;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by liujiatai on 2019/3/1.
 */

@Getter
@Setter
public class Car implements Serializable{
    private static final long serialVersionUID = -4496630340938732740L;
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
