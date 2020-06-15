package com.mishamba.day1.entity.timeHMS;

public class TimeHMS {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeHMS(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
