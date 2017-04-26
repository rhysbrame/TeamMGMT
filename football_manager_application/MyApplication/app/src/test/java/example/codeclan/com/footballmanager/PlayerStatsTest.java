package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayerStatsTest {

    PlayerStats newPlayerStats;

    @Before
    public void before() {
        newPlayerStats = new PlayerStats(18, 12, 10, 0.66);
    }

    @Test
    public void testPlayerStatsSetup() {
        assertEquals(18,  newPlayerStats.getPlayerCaps());
        assertEquals(12,  newPlayerStats.getPlayerGoals());
        assertEquals(10, newPlayerStats.getPlayerPoints());
        assertEquals(0.66,  newPlayerStats.getPlayerForm());
    }

    @Test
    public void testSetPlayerCaps() {
        newPlayerStats.setPlayerCaps(19);
        assertEquals(19, newPlayerStats.getPlayerCaps());
    }

    @Test
    public void testSetPlayerGoals() {
        newPlayerStats.setPlayerGoals(15);
        assertEquals(15, newPlayerStats.getPlayerGoals());
    }

    @Test
    public void testSetPlayerPoints() {
        newPlayerStats.setPlayerPoints(13);
        assertEquals(13, newPlayerStats.getPlayerPoints());
    }

    @Test
    public void testSetPlayerForm() {
        newPlayerStats.setPlayerForm(0.70);
        assertEquals(0.70, newPlayerStats.getPlayerForm());
    }
}