package com.mum.asd.w6.lab.state;

public class CeilingFan {
    private SpeedState speedState;

    public CeilingFan() {
        speedState = new OffSpeedState(this);
    }

    public void pullGreen() {
        speedState.pullGreen();
    }

    public void pullRed() {
        speedState.pullRed();
    }

    public void setSpeedState(SpeedState speedState) {
        this.speedState = speedState;
    }

    public SpeedState getSpeedState() {
        return speedState;
    }
}
