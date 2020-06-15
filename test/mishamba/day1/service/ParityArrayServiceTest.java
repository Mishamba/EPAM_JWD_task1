package mishamba.day1.service;

import com.mishamba.day1.exception.ProgramException;
import com.mishamba.day1.service.ParityArrayService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParityArrayServiceTest {

    @Test
    public void checkForParity_valid() {
        ParityArrayService service = new ParityArrayService();
        int[] variables = new int[4];
        variables[0] = 5;
        variables[1] = 2;
        variables[2] = 4;
        variables[3] = 6;
        try {
            boolean condition = service.checkForParity(variables);
            assertTrue(condition);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void checkForParity_wrongVariables_invalid() throws ProgramException {
        ParityArrayService service = new ParityArrayService();
        int[] variables = new int [4];
        variables[0] = 3;
        variables[1] = 132412;
        variables[2] = 3;
        variables[3] = 126421;
        service.checkForParity(variables);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void checkForParity_wrongArrayLength_invalid() throws ProgramException {
        ParityArrayService service = new ParityArrayService();
        int[] variables = new int[3];
        service.checkForParity(variables);
    }
}