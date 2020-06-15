package com.mishamba.day1.validator;

import com.mishamba.day1.entity.coordinate.PointXY;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointValidatorTest {

    @Test
    public void inRange_valid() {
        PointValidator validator = new PointValidator();
        PointXY point = new PointXY(3, 5);
        boolean condition = validator.inRange(point);
        assertTrue(condition);
    }

    @Test
    public void inRange_notContainsRange_invalid() {
        PointValidator validator = new PointValidator();
        PointXY point = new PointXY(3532, 5321);
        boolean condition = validator.inRange(point);
        assertFalse(condition);
    }
}