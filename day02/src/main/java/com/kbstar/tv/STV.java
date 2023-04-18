package com.kbstar.tv;

import com.kbstar.frame.TV;

public class STV implements TV{

    @Override
    public void turnOn() {
        System.out.println("stv 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("stv 끔");
    }
}
