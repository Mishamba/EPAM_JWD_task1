package com.mishamba.day1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayValidatorTest {

    @Test
    public void intervalContainsArray_valid() {
        ArrayValidator validator = new ArrayValidator();
        int[] variables = new int[4];
        variables[0] = 4;
        variables[1] = 3;
        variables[2] = 6;
        variables[3] = 8;
        boolean condition = validator.intervalContainsArray(variables);
        assertTrue(condition);
    }

    @Test
    public void intervalContainsArray_variablesNotContainsInterval_invalid() {
        ArrayValidator validator = new ArrayValidator();
        int[] variables = new int[4];
        variables[0] = 3;
        variables[1] = -12346123;
        variables[2] = 5;
        variables[3] = 8;
        boolean condition = validator.intervalContainsArray(variables);
        assertFalse(condition);
    }

    @Test
    public void intervalContainsArray_incorrectArrayLength_invalid() {
        ArrayValidator validator = new ArrayValidator();
        int[] variables = new int[3];
        boolean condition = validator.intervalContainsArray(variables);
        assertFalse(condition);
    }
}