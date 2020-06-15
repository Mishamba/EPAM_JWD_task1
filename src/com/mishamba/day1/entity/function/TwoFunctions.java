package com.mishamba.day1.entity.function;

public class TwoFunctions {
    public double func1(int x) {
        return -Math.pow(x, 2) + 3*x + 9;
    }

    public double func2(int x) {
        return 1/(Math.pow(x, 3) - 6);
    }
}
