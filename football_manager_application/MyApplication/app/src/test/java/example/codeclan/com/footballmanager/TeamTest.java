package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.TeamTypes.*;
import static junit.framework.Assert.assertEquals;


public class TeamTest {

    Team newTeam;

    @Before
    public void before() {
        newTeam = new Team(FIRST);
    }

    @Test
    public void testTeamSetup() {
        assertEquals(FIRST, newTeam.getTeamType());
    }

    @Test
    public void testSetTeamType() {
        newTeam.setTeamType(WOMENS);
        assertEquals(WOMENS, newTeam.getTeamType());
    }

    @Test
    public void testTeamSize() {
        assertEquals(11, newTeam.getTeamSize());
    }

    @Test
    public void testGetTeamForm(){
        assertEquals(0.00, newTeam.getTeamForm());
    }

    @Test
    public void testSetTeamForm(){
        newTeam.setTeamForm(0.75);
        assertEquals(0.75, newTeam.getTeamForm());
    }
}