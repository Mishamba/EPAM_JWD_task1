package com.mishamba.day1.entity.coordinate;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class PointXY implements Comparable<PointXY>{
    private final double x;
    private final double y;

    public PointXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointXY)) return false;
        PointXY pointXY = (PointXY) o;
        return Double.compare(pointXY.getX(), getX()) == 0 &&
                Double.compare(pointXY.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 62;
        int result = 6;
        result = (int) (prime * result + this.x);
        result = (int) (prime * result + this.y);

        return result;
    }


    @Override
    public String toString() {
        return String.format("x: %f, y: %f", this.x, this.y);
    }

    @Override
    public int compareTo(@NotNull PointXY point) {
        int result;
        double differenceX = Math.abs(this.x - point.getX());
        double differenceY = Math.abs(this.y - point.getY());

        if ((differenceX > 0) || (differenceY > 0)) {
            result = 1;
        } else if ((differenceX < 0) || (differenceY < 0)) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }
}
