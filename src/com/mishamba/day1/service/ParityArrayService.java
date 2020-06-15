package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.ArrayValidator;

public class ParityArrayService {
    private final int MIN_QUANTITY_OF_PARITY_NUMBERS = 2;
    public boolean checkForParity(int[] variables) throws ProgramException {
        ArrayValidator validator = new ArrayValidator();
        if (!validator.intervalContainsArray(variables)) {
            throw new ProgramException("numbers don't contains interval");
        }

        int counter = 0;
        for (int i = 0 ; i < 4; i++) {
            if (variables[i] % 2 == 0) {
                counter++;
            }
        }

        return (counter >= MIN_QUANTITY_OF_PARITY_NUMBERS);
    }
}
