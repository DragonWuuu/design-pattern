package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        prototypeClass.setName("dragon");
        prototypeClass.setAge(18);
        prototypeClass.setSex("male");
        try {
            PrototypeClass clone = prototypeClass.clone();
            log.info("PrototypeClass: {}", prototypeClass);
            log.info("clone:{}", clone);
            log.info("update clone name");
            clone.setName("clone");
            log.info("clone:{}", clone);
            log.info("PrototypeClass: {}", prototypeClass);
        } catch (CloneNotSupportedException e) {
            log.error("clone error", e);
        }
    }
}