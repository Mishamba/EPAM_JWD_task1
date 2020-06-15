package com.mishamba.day1.validator;

public class NegativeIntervalValidator {
    private final int LEFT_BORDER = 0;
    private final int RIGHT_BORDER = 100;

    public boolean negativeIntervalContain(double input) {
        return ((input > LEFT_BORDER) && (input < RIGHT_BORDER));
    }
}
