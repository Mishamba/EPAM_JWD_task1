package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.SecondsValidator;

public class SecondsService {
    private final int HOUR_IN_SECONDS = 3600;
    private final int HOUR_IN_MINUTES = 60;
    private final int MINUTE_IN_SECONDS = 60;
    private static String errorInfo = "seconds negative or more than a day";

    public int calculateFullHours(int seconds) throws ProgramException {
        SecondsValidator validator = new SecondsValidator();
        if (!validator.lessDay(seconds)) {
            throw new ProgramException(errorInfo);
        }

        return seconds/HOUR_IN_SECONDS;
    }

    public int calculateFullMinutes(int seconds) throws ProgramException {
        SecondsValidator validator = new SecondsValidator();
        if (!validator.lessDay(seconds)) {
            throw new ProgramException(errorInfo);
        }
        return (seconds/MINUTE_IN_SECONDS
                - calculateFullHours(seconds) * HOUR_IN_MINUTES);
    }

    public int calculateFullSeconds(int seconds) throws ProgramException {
        SecondsValidator validator = new SecondsValidator();
        if (!validator.lessDay(seconds)) {
            throw new ProgramException(errorInfo);
        }

        return (seconds - calculateFullMinutes(seconds) * MINUTE_IN_SECONDS
                - calculateFullHours(seconds) * HOUR_IN_SECONDS);
    }
}
