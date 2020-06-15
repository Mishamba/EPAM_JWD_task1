package com.mishamba.day1.validator;

public class DateValidator {
    private final int MIN_YEAR = 0;
    private final int MAX_YEAR = 2050;
    private final int JANUARY = 1;
    private final int DECEMBER = 12;

    public boolean correctDate(final int year, final int month) {
        return ((year > MIN_YEAR) && (year < MAX_YEAR) && (month >= JANUARY)
                && (month <= DECEMBER));
    }

    public boolean correctYear(final int year) {
        return ((year > 0) && (year < 2050));
    }
}
