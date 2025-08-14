package com.dragon.app;

public class Phone {
    private PhoneShell phoneShell;

    public Phone(PhoneShell phoneShell) {
        this.phoneShell = phoneShell;
    }

    public void installShell() {
        phoneShell.install();
    }
}
