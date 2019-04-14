package com.mum.asd.w6.lab.state;

public class LowSpeedState extends SpeedState{

    public LowSpeedState(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void pullGreen() {
        ceilingFan.setSpeedState(new MediumSpeedState(ceilingFan));
        System.out.println(ceilingFan.getSpeedState());
    }

    @Override
    public void pullRed() {
        ceilingFan.setSpeedState(new OffSpeedState(ceilingFan));
        System.out.println(ceilingFan.getSpeedState());
    }

    @Override
    public String toString() {
        return "Low Speed";
    }
}
