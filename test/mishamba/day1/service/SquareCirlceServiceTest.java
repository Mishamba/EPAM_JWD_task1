package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.SquareCirlceService;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SquareCirlceServiceTest {

    @Test
    public void calculateLittleSquareArea_valid() {
        SquareCirlceService service = new SquareCirlceService();
        int squareArea = 50;
        double expected = 25;
        try {
            double actual = service.calculateLittleSquareArea(squareArea);
            assertEquals(actual, expected);
        } catch(ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void calculateLittleSquareArea_negativeArea_invalid() throws ProgramException {
        SquareCirlceService service = new SquareCirlceService();
        int squareArea = -3;
        service.calculateLittleSquareArea(squareArea);
    }
}