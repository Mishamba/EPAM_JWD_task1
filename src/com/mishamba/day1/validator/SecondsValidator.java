package com.mishamba.day1.validator;

public class SecondsValidator {
    private final int DAY_LENGTH = 86400;
    public boolean lessDay(int seconds) {
        return ((seconds > 0) && (seconds < DAY_LENGTH));
    }
}
