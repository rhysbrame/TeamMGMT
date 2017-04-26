package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class PlayerTest {
    
    Player newPlayer;
    PlayerStats playerStats;
    
    @Before
    public void before() {
        playerStats = new PlayerStats(18, 12, 10);
        newPlayer = new Player("Kenneth Zohore", 25, MALE, playerStats);
        
    }

    @Test
    public void testPersonSetup() {
        assertEquals("Kenneth Zohore", newPlayer.getPersonName());
        assertEquals(MALE,  newPlayer.getSex());
        assertEquals(25,  newPlayer.getPersonAge());
    }
}