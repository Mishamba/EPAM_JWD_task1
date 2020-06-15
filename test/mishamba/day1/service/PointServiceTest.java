package mishamba.day1.service;

import com.mishamba.day1.entity.coordinate.PointXY;
import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.PointService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    @Test
    public void near_trueCondition_valid() {
        PointService service = new PointService();
        PointXY firstPoint = new PointXY(2, 5);
        PointXY secondPoint = new PointXY(5, 5);
        try {
            boolean condition = service.near(firstPoint, secondPoint);
            assertTrue(condition);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test
    public void near_falseCondition_valid() throws ProgramException {
        PointService service = new PointService();
        PointXY firstPoint = new PointXY(5, 5);
        PointXY secondPoint = new PointXY(2, 5);
        try {
            boolean condition = service.near(firstPoint, secondPoint);
            assertFalse(condition);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void near_outOfRange_invalid() throws ProgramException {
        PointService service = new PointService();
        PointXY firstPoint = new PointXY(123, 255);
        PointXY secondPoint = new PointXY(322, 6325);
        service.near(firstPoint, secondPoint);
    }
}