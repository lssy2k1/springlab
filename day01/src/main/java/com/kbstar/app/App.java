package com.kbstar.app;

import com.kbstar.frame.TV;
import com.kbstar.tv.STV;

public class App {
    public static void main(String args[]){
        TV tv = new STV();//여기다가 만들어진 티비만 가져다 놓으면 돼.
        tv.turnOff();
        tv.turnOn();
    }
}
