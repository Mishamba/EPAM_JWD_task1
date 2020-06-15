package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.NegativeIntervalValidator;

public class RadiusService {
    public double calcCircumference(int radius) throws ProgramException {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        if (!validator.negativeIntervalContain(radius)) {
            throw new ProgramException("negative radius");
        }
        return 2*Math.PI*radius;
    }

    public double calcCircleArea(int radius) throws ProgramException {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        if (!validator.negativeIntervalContain(radius)) {
            throw new ProgramException("negative radius");
        }
        return Math.PI*Math.pow(radius, 2);
    }
}
