package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.IntervalNumberValidator;
import com.mishamba.day1.validator.NegativeIntervalValidator;

public class NumberService {
    public double calculateLastNumberOfSquare(int number) throws ProgramException {
        IntervalNumberValidator validator = new IntervalNumberValidator();
        if (!validator.intervalContains(number)) {
            throw new ProgramException("interval don't contains number");
        }

        return Math.pow(number % 10, 2) % 10;
    }

    public boolean checkForPerfectNumber(int number) throws ProgramException {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        if (!validator.negativeIntervalContain(number)) {
            throw new ProgramException("number is negative or not contains interval");
        }
        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }

        return (sumOfDividers == number);
    }
}
