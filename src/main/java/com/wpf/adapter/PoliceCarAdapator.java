package com.wpf.adapter;
/**
 * 警车适配器
 */
public class PoliceCarAdapator extends CarController{

    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapator(){
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }
    @Override
    void phonate() {
        // TODO Auto-generated method stub
        sound.alarmsound();
    }

    @Override
    void twinkle() {
        // TODO Auto-generated method stub
        lamp.alarmLamp();
    }
    
}