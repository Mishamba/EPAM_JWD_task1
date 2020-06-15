package com.mishamba.day1.service;

import com.mishamba.day1.entity.storage.StorageXY;
import com.mishamba.day1.exception.ProgramException;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TableCreateServiceTest {

    @Test
    public void createTable_sameTables_valid() {
        TableCreateService service = new TableCreateService();
        int a = 1;
        int b = 7;
        int h = 2;
        StorageXY expected = new StorageXY();
        expected.setVariables(1,1.5574077246549023);
        expected.setVariables(3,-0.1425465430742778);
        expected.setVariables(5,-3.380515006246586);
        expected.setVariables(7,0.8714479827243188);
        try {
            StorageXY actual = service.createTable(a, b, h);
            assertEquals(actual, expected);
        } catch (ProgramException ex) {
            fail("catch exception");
        }
    }

    @Test
    public void createTable_differentTables_valid() {
        TableCreateService service = new TableCreateService();
        int a = 1;
        int b = 7;
        int h = 2;
        StorageXY expected = new StorageXY();
        expected.setVariables(1.557407726549023, 1);
        expected.setVariables(-0.1425465430742778, 3);
        expected.setVariables(-3.380515006246586, 5);
        expected.setVariables(0.8714479827243188, 7);
        try {
            StorageXY actual = service.createTable(a, b, h);
            assertNotEquals(actual, expected);
        } catch (ProgramException ex) {
            fail("got exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void createTable_bLessA_invalid() throws ProgramException {
        TableCreateService service = new TableCreateService();
        int a = -5;
        int b = -1;
        int h = 12364;
        service.createTable(a, b, h);
    }
}