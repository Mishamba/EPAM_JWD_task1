package com.mishamba.day1.service;

import com.mishamba.day1.entity.function.TwoFunctions;
import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.IntervalNumberValidator;

public class FunctionService {
    private final int FUNCTION_SWITCH = 3;
    public double calculateY(int x) throws ProgramException {
        IntervalNumberValidator validator = new IntervalNumberValidator();
        if (!validator.intervalContains(x)) {
            throw new ProgramException("x not contains interval");
        }

        TwoFunctions calculator = new TwoFunctions();
        return (x >= FUNCTION_SWITCH) ? calculator.func1(x) : calculator.func2(x);
    }
}
