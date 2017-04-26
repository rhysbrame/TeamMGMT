package example.codeclan.com.footballmanager;

public class Player extends Person {

    private int playerCaps;
    private int playerGoals;
    private double playerForm;

    public Player(String personName,
                  int personAge,
                  Sex sex,
                  int playerCaps,
                  int playerGoals,
                  double playerForm) {

        super(personName, personAge, sex);

        this.playerCaps = playerCaps;
        this.playerGoals = playerGoals;
        this.playerForm = playerForm;
    }

    public void setPlayerCaps(int caps) {
        playerCaps = caps;
    }

    public int getPlayerCaps() {
        return playerCaps;
    }

    public void setPlayerGoals(int goals) {
        playerGoals = goals;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerForm(double form) {
        playerForm = form;
    }

    public double getPlayerForm() {
        return playerForm;
    }
}