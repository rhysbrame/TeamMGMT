package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static example.codeclan.com.footballmanager.TeamTypes.*;
import static junit.framework.Assert.assertEquals;


public class TeamTest {

    Team newTeam;
    Player newPlayer;
    Manager newManager;

    @Before
    public void before() {
        newTeam = new Team(FIRST);
        newPlayer = new Player("Player1", 18, FEMALE);
        newPlayer = new Player("Player2", 19, FEMALE);
        newPlayer = new Player("Player3", 20, FEMALE);
        newPlayer = new Player("Player4", 21, FEMALE);
        newPlayer = new Player("Player5", 22, FEMALE);
        newPlayer = new Player("Player6", 23, FEMALE);
        newPlayer = new Player("Player7", 24, FEMALE);
        newPlayer = new Player("Player8", 25, FEMALE);
        newPlayer = new Player("Player9", 26, FEMALE);
        newPlayer = new Player("Player10", 27, FEMALE);
        newPlayer = new Player("Player11", 28, FEMALE);
        newPlayer = new Player("Player12", 29, FEMALE);
        newManager = new Manager("Manager1", 50, OTHER, 0.20);
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
    public void testSetTeamForm() {
        newTeam.setTeamForm(0.75);
        assertEquals(0.75, newTeam.getTeamForm());
    }

    @Test
    public void testAddPlayers() {
        newTeam.addPlayerToTeamSheet(newPlayer);
        assertEquals(1, newTeam.getTeamSheetSize());
    }

    @Test
    public void testDropPlayerByIndex() {
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        assertEquals(2, newTeam.getTeamSheetSize());
        newTeam.dropPlayerFromTeamSheetByIndex(0);
        assertEquals(1, newTeam.getTeamSheetSize());
    }

    @Test
    public void testCheckTeamFull() {
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        newTeam.addPlayerToTeamSheet(newPlayer);
        assertEquals(true, newTeam.checkTeamFull());
    }

    @Test
    public void testCoachingStaffSize() {
        assertEquals(0, newTeam.getCoachingStaffSize());
    }

    @Test
    public void testAddManagerToCoachingStaff() {
        newTeam.addManagerToCoachingStaff(newManager);
        assertEquals(1, newTeam.getCoachingStaffSize());
    }

    @Test
    public void testSackManager() {
        newTeam.addManagerToCoachingStaff(newManager);
        assertEquals(true, newTeam.sackManager(0.00));
    }

}