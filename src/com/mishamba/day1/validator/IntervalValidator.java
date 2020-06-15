package com.mishamba.day1.validator;

public class IntervalValidator {
    private final int A_LEFT_BORDER = -15;
    private final int A_RIGHT_BORDER = 15;
    private final int B_RIGHT_BORDER = 20;
    private final int H_LEFT_BORDER = 0;
    private final int H_RIGHT_BORDER = 10;

    public boolean correctInput(int a, int b, int h) {
        return  ((a < b) && (a > A_LEFT_BORDER) && (a < A_RIGHT_BORDER)
                && (b < B_RIGHT_BORDER)
                && (h > H_LEFT_BORDER) && (h < H_RIGHT_BORDER));
    }
}
