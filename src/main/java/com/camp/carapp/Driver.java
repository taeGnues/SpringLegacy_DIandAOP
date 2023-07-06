package com.camp.carapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    private Movable car;

    @Autowired
    public void setCar(Movable car) {
        this.car = car;
    }

    public void drive(){
        car.charge();
        car.powerOn();
        car.go();
        car.stop();
        car.powerOff();
    }

    public void chargeFuel(){
        car.charge();
    }
}
