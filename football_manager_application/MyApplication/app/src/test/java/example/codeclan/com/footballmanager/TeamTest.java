package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static example.codeclan.com.footballmanager.TeamTypes.*;
import static junit.framework.Assert.assertEquals;


public class TeamTest {

    Team newTeam;
    Player newPlayer1;
    Player newPlayer2;
    Player newPlayer3;
    Player newPlayer4;
    Player newPlayer5;
    Player newPlayer6;
    Player newPlayer7;
    Player newPlayer8;
    Player newPlayer9;
    Player newPlayer10;
    Player newPlayer11;
    Player newPlayer12;
    Manager newManager;
    PlayerStats playerStat;

    @Before
    public void before() {
        newTeam = new Team(FIRST);
        playerStat = new PlayerStats(18, 12, 10);
        newPlayer1 = new Player("Player1", 18, FEMALE, playerStat);
        newPlayer2 = new Player("Player2", 19, FEMALE, playerStat);
        newPlayer3 = new Player("Player3", 20, FEMALE, playerStat);
        newPlayer4 = new Player("Player4", 21, FEMALE, playerStat);
        newPlayer5 = new Player("Player5", 22, FEMALE, playerStat);
        newPlayer6 = new Player("Player6", 23, FEMALE, playerStat);
        newPlayer7 = new Player("Player7", 24, FEMALE, playerStat);
        newPlayer8 = new Player("Player8", 25, FEMALE, playerStat);
        newPlayer9 = new Player("Player9", 26, FEMALE, playerStat);
        newPlayer10 = new Player("Player10", 27, FEMALE, playerStat);
        newPlayer11 = new Player("Player11", 28, FEMALE, playerStat);
        newPlayer12 = new Player("Player12", 29, FEMALE, playerStat);
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
        newTeam.addPlayerToTeamSheet(newPlayer1);
        assertEquals(1, newTeam.getTeamSheetSize());
    }

    @Test
    public void testDropPlayerByIndex() {
        newTeam.addPlayerToTeamSheet(newPlayer1);
        newTeam.addPlayerToTeamSheet(newPlayer2);
        assertEquals(2, newTeam.getTeamSheetSize());
        newTeam.dropPlayerFromTeamSheetByIndex(0);
        assertEquals(1, newTeam.getTeamSheetSize());
    }

    @Test
    public void testCheckTeamFull() {
        newTeam.addPlayerToTeamSheet(newPlayer1);
        newTeam.addPlayerToTeamSheet(newPlayer2);
        newTeam.addPlayerToTeamSheet(newPlayer3);
        newTeam.addPlayerToTeamSheet(newPlayer4);
        newTeam.addPlayerToTeamSheet(newPlayer5);
        newTeam.addPlayerToTeamSheet(newPlayer6);
        newTeam.addPlayerToTeamSheet(newPlayer7);
        newTeam.addPlayerToTeamSheet(newPlayer8);
        newTeam.addPlayerToTeamSheet(newPlayer9);
        newTeam.addPlayerToTeamSheet(newPlayer10);
        newTeam.addPlayerToTeamSheet(newPlayer11);
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