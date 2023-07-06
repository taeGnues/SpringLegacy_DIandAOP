package com.camp.carapp;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect // aspect로 동작
@Component
public class LogAspect {

    // Movable 인터페이스의 charge() 메소드에 주겠다.
    @AfterReturning("execution(* com.camp..Movable.charge())") // pointcut을 줘야함. 메소드 프로토타입에 대해 줌. 리턴타입은 신경안쓰겠다!
    public void logging(){ // joinpointing argu받을 수 있음.
        System.out.println("========연료 채우기 완료=========");
    }
}
