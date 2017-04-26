package example.codeclan.com.footballmanager;

public class PlayerStats {
    private int playerCaps;
    private int playerGoals;
    private int playerPoints;
    private double playerForm;

    public PlayerStats(int playerCaps, int playerGoals, int playerPoints) {
        this.playerCaps = playerCaps;
        this.playerGoals = playerGoals;
        this.playerPoints = playerPoints;
    }

    public void setPlayerCaps(int caps) {
        playerCaps = caps;
    }

    public int getPlayerCaps() {
        return playerCaps;
    }

    public void addPlayerGoals(int goalsToAdd) {
        playerGoals += goalsToAdd;
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

    //* the formula for this is playerpoints divided by player caps. 1 is perfect and 0 is poor.

    public double workOutPlayerForm() {
        int playerPoints = getPlayerPoints();
        int caps = getPlayerCaps() * 3;
        double form = playerPoints / (double) caps;
        return form;
    }
}