package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StadiumTest {

    Stadium newStadium;

    @Before
    public void before() {
        newStadium = new Stadium("Cardiff City Stadium", 29000, 35.00);
    }

    @Test
    public void testStadiumSetup() {
        assertEquals("Cardiff City Stadium", newStadium.getStadiumName());
        assertEquals(29000, newStadium.getStadiumCapacity());
        assertEquals(35.00, newStadium.getTicketPrice());
    }

    @Test
    public void testSetStadiumName() {
        newStadium.setStadiumName("Ninian Park");
        assertEquals("Ninian Park", newStadium.getStadiumName());
    }

    @Test
    public void testSetStadiumCapacity() {
        newStadium.setStadiumCapacity(35000);
        assertEquals(35000, newStadium.getStadiumCapacity());
    }

    @Test
    public void testSetTicketPrice() {
        newStadium.setTicketPrice(29.00);
        assertEquals(29.00, newStadium.getTicketPrice());
    }

}
