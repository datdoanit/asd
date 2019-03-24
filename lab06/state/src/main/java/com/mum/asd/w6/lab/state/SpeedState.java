package com.mum.asd.w6.lab.state;

public abstract class SpeedState {
    protected final CeilingFan ceilingFan;

    public SpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public abstract void pullGreen();

    public abstract void pullRed();
}
