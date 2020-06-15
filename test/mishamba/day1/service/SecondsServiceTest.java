package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.SecondsService;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SecondsServiceTest {

    @Test
    public void calculateFullHours_valid() {
        SecondsService service = new SecondsService();
        int seconds = 23523;
        int expected= 6;
        try {
            int actual = service.calculateFullHours(seconds);
            assertEquals(actual, expected);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void calculateFullMinutesValid()  {
        SecondsService service = new SecondsService();
        int seconds = 23523;
        int expected = 32;
        try {
            int actual = service.calculateFullMinutes(seconds);
            assertEquals(actual, expected);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void testCalculateFullSecondsValid() {
        SecondsService service = new SecondsService();
        int seconds = 23523;
        int expected= 3;
        try {
            int actual = service.calculateFullSeconds(seconds);
            assertEquals(actual, expected);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testCalculateFullHoursInvalid() throws ProgramException {
        SecondsService service = new SecondsService();
        int seconds = -35;
        service.calculateFullHours(seconds);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testCalculateFullMinutesInvalid() throws ProgramException {
        SecondsService service = new SecondsService();
        int seconds = -35;
        service.calculateFullMinutes(seconds);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testCalculateFullSecondsInvalid() throws ProgramException {
        SecondsService service = new SecondsService();
        int seconds = -35;
        service.calculateFullSeconds(seconds);
    }
}