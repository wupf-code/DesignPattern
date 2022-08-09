package com.wpf.bridge;

public class Vivo implements brand{

    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("vivo手机打电话");
    }
    
}
