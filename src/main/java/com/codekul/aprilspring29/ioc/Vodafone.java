package com.codekul.aprilspring29.ioc;

public class Vodafone implements Sim {
    @Override
    public void calling() {
        System.out.println("In vodafone calling");
    }

    @Override
    public void msg() {
        System.out.println("In vodafone msg");
    }
}
