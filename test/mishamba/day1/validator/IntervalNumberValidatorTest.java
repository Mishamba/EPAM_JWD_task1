package com.mishamba.day1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntervalNumberValidatorTest {

    @Test
    public void intervalContains_valid() {
        IntervalNumberValidator validator = new IntervalNumberValidator();
        int input = 3;
        boolean condition = validator.intervalContains(input);
        assertTrue(condition);
    }

    @Test
    public void intervalContains_notContainsInterval_invalid() {
        IntervalNumberValidator validator = new IntervalNumberValidator();
        int input = -123;
        boolean condition = validator.intervalContains(input);
        assertFalse(condition);
    }
}