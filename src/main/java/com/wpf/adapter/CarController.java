package com.wpf.adapter;
/**
 * 目标抽象类
 */
public abstract class CarController {
    void move (){
        System.out.println("玩具车移动");
    }
    abstract void phonate();//发出声音
    abstract void twinkle();//灯光闪烁
}
