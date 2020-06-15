package com.mishamba.day1.validator;

import com.mishamba.day1.service.RadiusService;

public class IntervalNumberValidator {
    private final int LEFT_BORDER = -100;
    private final int RIGHT_BORDER = 100;

    public boolean intervalContains(double input) {
        return ((input > LEFT_BORDER) && (input < RIGHT_BORDER));
    }
}
