package com.mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.validator.DateValidator;

import java.time.Month;

public class DateService {
    public DateService() {
        // Create service
    }

    public boolean yearIsLeap(int year) throws ProgramException {
        DateValidator validator = new DateValidator();
        if (!validator.correctYear(year)) {
            throw new ProgramException("incorrect year");
        }
        /* If residue from division year on 4 is 0, so year is leap.
         * If residue from division year on 100 is 0, so year can be leap,
         * if residue from division year on 400 is 0, so year in leap
         */
        return ((year % 4==0) || (year % 100 == 0));
    }

    public int daysInMonth(int monthNumber, int year) throws ProgramException {
        DateValidator validator = new DateValidator();
        if (!validator.correctDate(year, monthNumber)) {
            throw new ProgramException("incorrect date");
        }

        return Month.of(monthNumber).length(yearIsLeap(year));
    }
}
