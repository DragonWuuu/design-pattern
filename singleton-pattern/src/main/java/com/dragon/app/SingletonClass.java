package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass() {
        log.info("created singleton class");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
