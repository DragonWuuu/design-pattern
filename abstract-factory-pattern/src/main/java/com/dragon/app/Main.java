package com.dragon.app;

import com.dragon.app.bo.Battery;
import com.dragon.app.bo.Charger;
import com.dragon.app.bo.Phone;
import com.dragon.app.bo.PhoneShell;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new XiaomiFactory();
        Phone phone = factory.createPhone();
        log.info("phone:{}", phone);
        PhoneShell phoneShell = factory.createPhoneShell();
        log.info("phoneShell:{}", phoneShell);
        Charger charger = factory.createCharger();
        log.info("charger:{}", charger);
        Battery battery = factory.createBattery();
        log.info("battery:{}", battery);
    }
}
