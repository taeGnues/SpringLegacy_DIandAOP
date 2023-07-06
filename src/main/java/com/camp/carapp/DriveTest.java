package com.camp.carapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriveTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        Driver driver = context.getBean("driver", Driver.class); // ("해당클래스소문자", 클래스);
        driver.drive();
        driver.chargeFuel();
    }
}
