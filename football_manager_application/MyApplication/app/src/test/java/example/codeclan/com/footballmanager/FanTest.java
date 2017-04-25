package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class FanTest {

    Fan newFan;

    @Before
    public void before() {
        newFan = new Fan("Steve 'the Cleaver' Weaver", 54, MALE, 100.00);
    }

    @Test
    public void testFanSetup() {
        assertEquals("Steve 'the Cleaver' Weaver", newFan.getPersonName());
        assertEquals(54, newFan.getPersonAge());
        assertEquals(MALE, newFan.getSex());
        assertEquals(100.00, newFan.getWallet());
    }

    @Test
    public void testSetWallet() {
        newFan.setWallet(45.00);
        assertEquals(45.00, newFan.getWallet());
    }

    @Test
    public void testSetSex() {
        newFan.setSex(OTHER);
        assertEquals(OTHER, newFan.getSex());
    }
}
