package com.camp.carapp;

import org.springframework.stereotype.Component;

@Component
public class ElecCar implements Movable{
    @Override
    public void charge() {
        System.out.println("전기차 charge");
    }

    @Override
    public void powerOn() {
        System.out.println("전기차 poweron");

    }

    @Override
    public void go() {
        System.out.println("전기차 go");
    }

    @Override
    public void stop() {
        System.out.println("전기차 stop");
    }

    @Override
    public void powerOff() {
        System.out.println("전기차 poweroff");
    }
}
