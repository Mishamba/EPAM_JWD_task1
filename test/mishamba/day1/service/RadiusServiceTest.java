package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.RadiusService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadiusServiceTest {

    @Test
    public void calcCircumference_valid() {
        RadiusService service = new RadiusService();
        int radius = 15;
        float expected = 94.2477F;
        float delta = 0.001F;
        try {
            double actual = service.calcCircumference(radius);
            assertEquals(actual, expected, delta);
        } catch(ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void calcCircleArea_valid() {
        RadiusService service = new RadiusService();
        int radius = 15;
        float expected = 706.8583F;
        float delta = 0.001F;
        try {
            double actual = service.calcCircleArea(radius);
            assertEquals(actual, expected, delta);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void calcCircumference_negativeRadius_invalid() throws ProgramException {
        RadiusService service = new RadiusService();
        int radius = -12;
        service.calcCircumference(radius);
    }

    @Test(expectedExceptions = ProgramException.class)
    void calcCircleArea_negativeRadius_invalid() throws ProgramException {
        RadiusService service = new RadiusService();
        int radius = -3;
        service.calcCircleArea(radius);
    }
}