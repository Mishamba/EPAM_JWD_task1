package com.mishamba.day1.service;

import com.mishamba.day1.entity.coordinate.Interval;
import com.mishamba.day1.entity.storage.StorageXY;
import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.IntervalValidator;
import org.jetbrains.annotations.NotNull;

public class TableCreateService {
    public StorageXY createTable(int a, int b, int h) throws ProgramException {
        IntervalValidator validator = new IntervalValidator();
        if (!validator.correctInput(a, b, h)) {
            throw new ProgramException("incorrect input");
        }

        StorageXY storage = new StorageXY();
        this.createVariables(new Interval(a, b), h, storage);
        return storage;
    }

    private void createVariables(@NotNull Interval interval, int h, StorageXY storage) {
        for (int i = interval.getA(); i < interval.getB() + h; i += h) {
            double x = Math.min(i, interval.getB());
            storage.setVariables(x, Math.tan(x));
        }
    }
}
