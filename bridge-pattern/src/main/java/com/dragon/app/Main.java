package com.dragon.app;

public class Main {
    public static void main(String[] args) {
        PhoneShell purePhoneShell = new PurePhoneShell();
        Phone phone = new Phone(purePhoneShell);
        phone.installShell();
    }
}