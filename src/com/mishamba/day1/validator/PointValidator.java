package com.mishamba.day1.validator;

import com.mishamba.day1.entity.coordinate.PointXY;
import org.jetbrains.annotations.NotNull;

public class PointValidator {
    private final int Y_LEFT_BORDER = -20;
    private final int Y_RIGHT_BORDER = 20;
    private final int X_LEFT_BORDER = -20;
    private final int X_RIGHT_BORDER = 20;

    public boolean inRange(@NotNull PointXY point) {
        return ((point.getY() > Y_LEFT_BORDER) && (point.getY() < Y_RIGHT_BORDER)
                && (point.getX() > X_LEFT_BORDER)
                && (point.getX() < X_RIGHT_BORDER));
    }
}
