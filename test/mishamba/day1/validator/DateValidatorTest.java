package mishamba.day1.validator;

import com.mishamba.day1.validator.DateValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateValidatorTest {

    @Test
    public void correctDate_valid() {
        DateValidator validator = new DateValidator();
        int year = 2000;
        int month = 12;
        boolean condition = validator.correctDate(year, month);
        assertTrue(condition);
    }

    @Test
    public void correctYear_valid() {
        DateValidator validator = new DateValidator();
        int year = 135;
        boolean condition = validator.correctYear(year);
        assertTrue(condition);
    }

    @Test
    public void correctDate_negativeMonthAndYear_invalid() {
        DateValidator validator = new DateValidator();
        int year = -4324741;
        int month = -12;
        boolean condition = validator.correctDate(year, month);
        assertFalse(condition);
    }

    @Test
    public void correctYear_negativeYear_invalid() {
        DateValidator validator = new DateValidator();
        int year = -32;
        boolean condition = validator.correctYear(year);
        assertFalse(condition);
    }
}