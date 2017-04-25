package example.codeclan.com.footballmanager;

public class Team {

    private TeamTypes type;

    private int teamSize = 11;
    private double teamForm = 0.00;


    public Team(TeamTypes type){
        this.type = type;
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
}
