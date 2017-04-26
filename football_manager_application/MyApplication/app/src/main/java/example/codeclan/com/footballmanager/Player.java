package example.codeclan.com.footballmanager;

public class Player extends Person {

    //* would other objects go here

    PlayerStats playerStat;

    public Player(String personName, int personAge, Sex sex, PlayerStats playerStat) {
        super(personName, personAge, sex);
        this.playerStat = playerStat;
    }

    public double getPlayerForm(){
        return playerStat.workOutPlayerForm();
    }
}