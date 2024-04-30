package com.codekul.aprilspring29.ioc;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("In Jio calling");
    }

    @Override
    public void msg() {
        System.out.println("In Jio msg");
    }
}
