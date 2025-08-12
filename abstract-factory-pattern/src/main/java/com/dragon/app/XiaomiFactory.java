package com.dragon.app;

import com.dragon.app.bo.Battery;
import com.dragon.app.bo.Charger;
import com.dragon.app.bo.Phone;
import com.dragon.app.bo.PhoneShell;

public class XiaomiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return  new Phone();
    }

    @Override
    public PhoneShell createPhoneShell() {
        return new PhoneShell();
    }

    @Override
    public Charger createCharger() {
        return new Charger();
    }

    @Override
    public Battery createBattery() {
        return new Battery();
    }
}
