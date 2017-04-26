package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class FanTest {

    Fan newFan;
    Stadium newStadium;

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

    @Test
    public void testCanBuyTicket() {
        newFan.setWallet(150.00);
        newStadium = new Stadium("Home", 45000, 23.00);
        double ticketPrice = newStadium.getTicketPrice();
        boolean result = newFan.buyTicket(4, ticketPrice);
        assertEquals(58.00, newFan.getWallet());
        assertEquals(true, result);
    }

    @Test
    public void testCannotBuyTicket() {
        newFan.setWallet(20.00);
        newStadium = new Stadium("Home", 15000, 25.00);
        double ticketPrice = newStadium.getTicketPrice();
        boolean result = newFan.buyTicket(2, ticketPrice);
        assertEquals(20.00, newFan.getWallet());
        assertEquals(false, result);
    }
}
