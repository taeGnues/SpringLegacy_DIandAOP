package com.camp.carapp;

import org.springframework.stereotype.Component;

//@Component // 하나만 등록하니깐 이름을 신경쓸필요 없음. 이거만 가져옴. (첫번째 이름은 소문자가 된 것으로 등록됨 (sportsCar)
public class SportsCar implements Movable{
    @Override
    public void charge() {
        System.out.println("스포츠차 charge");
    }

    @Override
    public void powerOn() { System.out.println("스포츠차 poweron"); }

    @Override
    public void go() {
        System.out.println("스포츠차 go");
    }

    @Override
    public void stop() {
        System.out.println("스포츠차 stop");
    }

    @Override
    public void powerOff() {
        System.out.println("스포츠차 poweroff");
    }
}
