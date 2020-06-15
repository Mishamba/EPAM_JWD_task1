package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.NegativeIntervalValidator;

public class SquareCirlceService {
    public double calculateLittleSquareArea(double squareArea)
            throws ProgramException {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        if (!validator.negativeIntervalContain(squareArea)) {
            throw new ProgramException("input is negative or interval doesn't contains this number");
        }
        return squareArea / 2;
    }
}
