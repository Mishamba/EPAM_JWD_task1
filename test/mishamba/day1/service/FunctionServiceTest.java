package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.FunctionService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionServiceTest {

    @Test
    public void calculateY_xMoreThree_valid()  {
        FunctionService service = new FunctionService();
        int x = 1;
        double expected = -0.2;
        try {
            double actual = service.calculateY(x);
            assertEquals(expected, actual);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void calculateY_xLessThree_valid() {
        FunctionService service = new FunctionService();
        int x = 4;
        double expexted = 5;
        try {
            double actual = service.calculateY(x);
            assertEquals(actual,expexted);
        } catch (ProgramException e) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void calculateY_invalid() throws ProgramException {
        FunctionService service = new FunctionService();
        int x = -12345;
        service.calculateY(x);
    }
}