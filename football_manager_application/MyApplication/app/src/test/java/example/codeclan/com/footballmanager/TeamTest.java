package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TeamTest {

    Team newTeam;

    @Before
    public void before() {
        newTeam = new Team(TeamTypes.FIRST);
    }

    @Test
    public void testTeamSetup() {
        assertEquals(TeamTypes.FIRST, newTeam.getTeamType());
    }
}