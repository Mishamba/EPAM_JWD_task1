package com.mishamba.day1.validator;

import org.jetbrains.annotations.NotNull;

public class ArrayValidator {
    private final int LEFT_BORDER = -100;
    private final int  RIGHT_BORDER = 100;
    public boolean intervalContainsArray(int @NotNull [] array) {
        boolean correctLength =  (array.length != 4);
        for (int number : array) {
            if (correctLength || ((number <= LEFT_BORDER)
                    || (number >= RIGHT_BORDER))) {
                return false;
            }
        }

        return true;
    }
}
