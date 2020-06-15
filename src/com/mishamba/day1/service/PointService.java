package com.mishamba.day1.service;

import com.mishamba.day1.entity.coordinate.PointXY;
import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.PointValidator;

public class PointService {
    public boolean near(PointXY firstPoint, PointXY secondPoint) throws ProgramException {
        PointValidator validator = new PointValidator();
        if (!(validator.inRange(firstPoint) && validator.inRange(secondPoint))) {
            throw new ProgramException("points not in range");
        }
        double firstHipot = Math.hypot(firstPoint.getX(), firstPoint.getY());
        double secondHipot = Math.hypot(secondPoint.getX(), secondPoint.getY());
        return (firstHipot < secondHipot);
    }
}
