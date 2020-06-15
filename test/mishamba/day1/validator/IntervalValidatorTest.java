package mishamba.day1.validator;

import com.mishamba.day1.validator.IntervalValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntervalValidatorTest {

    @Test
    public void correctInput_valid() {
        IntervalValidator validator = new IntervalValidator();
        int a = 5;
        int b = 14;
        int h = 3;
        boolean condition = validator.correctInput(a, b, h);
        assertTrue(condition);
    }

    @Test
    public void correctInput_bLessA_invalid() {
        IntervalValidator validator = new IntervalValidator();
        int a =-12;
        int b = -13;
        int h = 3266;
        boolean condition = validator.correctInput(a, b, h);
        assertFalse(condition);
    }
}