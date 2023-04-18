package com.kbstar.app;

import com.kbstar.frame.TV;
import com.kbstar.tv.STV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]){
//        TV tv = new STV();//여기다가 만들어진 티비만 가져다 놓으면 돼.
//        tv.turnOff();
//        tv.turnOn(); //자바의 커플링이 강하게 되어있었다. 이제 바꿀 것.

        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        TV tv = (TV) factory.getBean("stv");//lookup
        tv.turnOn();//DI 의존성주입
    }
}
