package com.mishamba.day1.validator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NegativeIntervalValidatorTest {

    @Test
    public void negativeIntervalContain_valid() {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        int input = 34;
        boolean condition = validator.negativeIntervalContain(input);
        assertTrue(condition);
    }

    @Test
    public void negativeIntervalContain_inputOutOfRange_invalid() {
        NegativeIntervalValidator validator = new NegativeIntervalValidator();
        int input = -133;
        boolean condition = validator.negativeIntervalContain(input);
        assertFalse(condition);
    }
}