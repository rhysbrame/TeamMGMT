package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ClubTest {

    Club newClub;

    @Before
    public void before(){
        newClub = new Club("Cardiff City FC", 5000000.00);
    }

    @Test
    public void testClubSetup() {
        assertEquals("Cardiff City FC", newClub.getClubName());
        assertEquals(5000000.00, newClub.getClubAccount());
    }

    
}
