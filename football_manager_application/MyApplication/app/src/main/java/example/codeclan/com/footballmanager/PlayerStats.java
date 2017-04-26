package example.codeclan.com.footballmanager;

public class PlayerStats {
    private int playerCaps = 0;
    private int playerGoals = 0;
    private int playerPoints = 0;

    public PlayerStats(int playerCaps, int playerGoals, int playerPoints) {
        this.playerCaps = playerCaps;
        this.playerGoals = playerGoals;
        this.playerPoints = playerPoints;
    }

    public void addPlayerCaps(int capsToAdd) {
        playerCaps += capsToAdd;
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

    public void addPlayerPoints(int pointsToAdd) {
        playerPoints += pointsToAdd;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public double workOutPlayerForm() {
        double form = getPlayerPoints() / ((double) getPlayerCaps() * 3);
        return form;
    }
}