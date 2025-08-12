package com.dragon.app;

import com.dragon.app.bo.Battery;
import com.dragon.app.bo.Charger;
import com.dragon.app.bo.Phone;
import com.dragon.app.bo.PhoneShell;

public interface AbstractFactory {
    Phone createPhone();
    PhoneShell createPhoneShell();
    Charger createCharger();
    Battery createBattery();
}
