package com.avn.tns.abstraction;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractDemo obj = new AbstractImpl();
        obj.display();
        obj.add();
    }
}
