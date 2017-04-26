package example.codeclan.com.footballmanager;

public class PlayerStats {
    private int playerCaps;
    private int playerGoals;
    private int playerPoints;
    private double playerForm;

    public PlayerStats(int playerCaps, int playerGoals, int playerPoints, double playerForm) {

        this.playerCaps = playerCaps;
        this.playerGoals = playerGoals;
        this.playerPoints = playerPoints;
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

    public void setPlayerPoints(int points) {
        playerPoints = points;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerForm(double form) {
        playerForm = form;
    }

    public double getPlayerForm() {
        return playerForm;
    }
}