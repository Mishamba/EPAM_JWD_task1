package com.mishamba.day1.validator;

import com.mishamba.day1.service.SecondsService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondsValidatorTest {

    @Test
    public void lessDay_valid() {
        SecondsValidator validator = new SecondsValidator();
        int seconds = 432;
        boolean condition = validator.lessDay(seconds);
        assertTrue(condition);
    }

    @Test
    public void lessDay_negativeSeconds_invalid() {
        SecondsValidator validator = new SecondsValidator();
        int seconds = -3135;
        boolean condition = validator.lessDay(seconds);
        assertFalse(condition);
    }
}
