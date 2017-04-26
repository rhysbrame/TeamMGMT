package example.codeclan.com.footballmanager;

import java.util.ArrayList;

public class Team {
    private TeamTypes type;
    private int teamSize = 11;
    private double teamForm = 0.00;
    private ArrayList<Player> teamSheet;
    private ArrayList<Manager> coachingStaff;

    public Team(TeamTypes type){
        this.type = type;
        this.teamSheet = new ArrayList<>();
        this.coachingStaff = new ArrayList<>();
    }

    public void setTeamType(TeamTypes teamType) {
        type = teamType;
    }

    public TeamTypes getTeamType() {
        return type;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamForm(double form){
        teamForm = form;
    }

    public double getTeamForm(){
        return teamForm;
    }

    public void addPlayerToTeamSheet(Player player) {
        teamSheet.add(player);
    }

    public void dropPlayerFromTeamSheetByIndex(int index) {
        teamSheet.remove(index);
    }

    public int getTeamSheetSize() {
        return teamSheet.size();
    }

    public boolean checkTeamFull() {
        return teamSheet.size() == teamSize;
    }

    public void addManagerToCoachingStaff(Manager manager) {
        coachingStaff.add(manager);
    }

    public boolean sackManager(double managerForm) {
        if (managerForm <= 0.15) {
            coachingStaff.remove(0);
            return true;
        }
        return false;
    }

    public int getCoachingStaffSize() {
        return coachingStaff.size();
    }
}
