package com.mum.asd.w6.lab.state;

public class MediumSpeedState extends SpeedState{

    public MediumSpeedState(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void pullGreen() {
        ceilingFan.setSpeedState(new HighSpeedState(ceilingFan));
        System.out.println(ceilingFan.getSpeedState());
    }

    @Override
    public void pullRed() {
        ceilingFan.setSpeedState(new LowSpeedState(ceilingFan));
        System.out.println(ceilingFan.getSpeedState());
    }
    @Override
    public String toString() {
        return "Medium Speed";
    }
}
