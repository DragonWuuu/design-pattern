package com.dragon.app;

public class Main {
    public static void main(String[] args) {
        Component component = new LogConcreteComponent(new ConcreteComponent());
        component.operation();

    }
}