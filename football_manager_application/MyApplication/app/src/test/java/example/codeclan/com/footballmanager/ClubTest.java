package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ClubTest {

    Club newClub;

    @Before
    public void before(){
        newClub = new Club("Cardiff City FC", 5.00);
    }

    @Test
    public void testClubSetup() {
        assertEquals("Cardiff City FC", newClub.getClubName());
        assertEquals(5.00, newClub.getClubAccount());
    }

    @Test
    public void testSetName() {
        newClub.setClubName("Swansea City FC");
        assertEquals("Swansea City FC", newClub.getClubName());
    }

    @Test
    public void testSetAccount() {
        newClub.setClubAccount(15.00);
        assertEquals(15.00, newClub.getClubAccount());
    }
}
