package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class PlayerTest {
    
    Player newPlayer;
    
    @Before
    public void before() {
        newPlayer = new Player("Kenneth Zohore", 25, MALE, 18, 12, 0.66);
        
    }

    @Test
    public void testPersonSetup() {
        assertEquals("Kenneth Zohore", newPlayer.getPersonName());
        assertEquals(MALE,  newPlayer.getSex());
        assertEquals(25,  newPlayer.getPersonAge());
        assertEquals(18,  newPlayer.getPlayerCaps());
        assertEquals(12,  newPlayer.getPlayerGoals());
        assertEquals(0.66,  newPlayer.getPlayerForm());
    }

    @Test
    public void testSetPlayerCaps() {
        newPlayer.setPlayerCaps(19);
        assertEquals(19, newPlayer.getPlayerCaps());
    }

    @Test
    public void testSetPlayerGoals() {
        newPlayer.setPlayerGoals(15);
        assertEquals(15, newPlayer.getPlayerGoals());
    }

    @Test
    public void testSetPlayerForm() {
        newPlayer.setPlayerForm(0.70);
        assertEquals(0.70, newPlayer.getPlayerForm());
    }
}