package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        log.info("instance: {}", instance);
        SingletonClass instance2 = SingletonClass.getInstance();
        log.info("instance2: {}", instance2);
        log.info("instance == instance2: {}", instance == instance2);

    }
}