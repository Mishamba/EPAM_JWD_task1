package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.DateService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateServiceTest {

    @Test
    public void yearIsLeap_valid() {
        DateService service = new DateService();
        int year = 2000;
        try {
            boolean condition = service.yearIsLeap(year);
            assertTrue(condition);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void daysInMonth_valid() {
        DateService service = new DateService();
        int year = 1995;
        int month = 2;
        try {
            int actual = service.daysInMonth(month, year);
            assertEquals(service.daysInMonth(month, year), 28);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void yearIsLeap_invalid() throws ProgramException {
        DateService service = new DateService();
        int year = -123;
        service.yearIsLeap(year);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void daysInMonth_invalid() throws ProgramException {
        DateService service = new DateService();
        int year = 2000;
        int month = 13;
        service.daysInMonth(month, year);
    }
}