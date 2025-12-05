package com.korit.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfig {

    public class A {
        public A() {
            System.out.println("A 클래스 생성");
        }

        public void print() {
            System.out.println("print 호출");
        }
    }

    @Bean
    public A bb() {
        System.out.println("a 호출");
        return new A();
    }
    //Bean이라는 메서드가 있으면 실행을 하고 a가 호출이 되고 ne
    // w A라는 객체가 있고 A객체를 생성해서 리턴을 하는데 해당 이름으로 a라는 객체가 생성

}
