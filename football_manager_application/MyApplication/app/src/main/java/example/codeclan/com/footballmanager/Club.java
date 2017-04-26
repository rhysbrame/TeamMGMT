package example.codeclan.com.footballmanager;

public class Club {
    private String clubName;
    private double clubAccount;

    public Club(String clubName, double clubAccount){
        this.clubName = clubName;
        this.clubAccount = clubAccount;
    }

    public void setClubName(String name) {
        clubName = name;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubAccount(double amount) {
        clubAccount = amount;
    }

    public double getClubAccount() {
        return clubAccount;
    }

    public void sellTicket (int attendance, double ticketPrice) {
        double matchDaySales = attendance * ticketPrice;
        System.out.println(matchDaySales);
        double toAdd = getClubAccount() + matchDaySales;
        System.out.println(toAdd);
        setClubAccount(toAdd);
    }
}