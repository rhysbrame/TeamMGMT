package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class PlayerTest {
    
    Player newPlayer;
    
    @Before
    public void before() {
        newPlayer = new Player("Kenneth Zohore", 25, MALE);
        
    }

    @Test
    public void testPersonSetup() {
        assertEquals("Kenneth Zohore", newPlayer.getPersonName());
        assertEquals(MALE,  newPlayer.getSex());
        assertEquals(25,  newPlayer.getPersonAge());
    }
}