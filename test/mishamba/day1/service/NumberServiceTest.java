package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void calculateLastNumberOfSquare_valid() {
        NumberService service = new NumberService();
        int number = -12;
        double expected = 4;
        try {
            double actual = service.calculateLastNumberOfSquare(number);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail("got exception");
        }
    }

    @Test
    public void checkForPerfectNumber_valid() {
        NumberService service = new NumberService();
        int number  = 28;
        try {
            boolean condition = service.checkForPerfectNumber(number);
            assertTrue(condition);
        } catch (ProgramException e) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void calculateLastNumberOfSquare_invalid() throws ProgramException {
        NumberService service = new NumberService();
        int number  = -123;
        service.calculateLastNumberOfSquare(number);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void checkForPerfectNumber_invalid() throws ProgramException {
        NumberService service = new NumberService();
        int number = -12;
        service.checkForPerfectNumber(number);
    }
}