package com.dragon.app;

import lombok.Data;

@Data
public class PrototypeClass implements Cloneable{
    private String name;
    private int age;
    private String sex;

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }
}
