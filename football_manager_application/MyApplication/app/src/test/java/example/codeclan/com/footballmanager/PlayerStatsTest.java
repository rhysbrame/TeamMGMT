package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayerStatsTest {

    PlayerStats newPlayerStats;

    @Before
    public void before() {
        newPlayerStats = new PlayerStats(18, 12, 10);
    }

    @Test
    public void testPlayerStatsSetup() {
        assertEquals(18,  newPlayerStats.getPlayerCaps());
        assertEquals(12,  newPlayerStats.getPlayerGoals());
        assertEquals(10, newPlayerStats.getPlayerPoints());
    }

    @Test
    public void testAddPlayerCaps() {
        newPlayerStats.addPlayerCaps(1);
        assertEquals(19, newPlayerStats.getPlayerCaps());
    }

    @Test
    public void testAddPlayerGoals() {
        newPlayerStats.addPlayerGoals(3);
        assertEquals(15, newPlayerStats.getPlayerGoals());
    }

    @Test
    public void testAddPlayerPoints() {
        newPlayerStats.addPlayerPoints(3);
        assertEquals(13, newPlayerStats.getPlayerPoints());
    }

    @Test
    public void testWorkOutPlayerForm() {
        newPlayerStats = new PlayerStats(5, 0, 10);
        newPlayerStats.workOutPlayerForm();
        assertEquals(0.66, newPlayerStats.workOutPlayerForm(), 0.01);
    }
}