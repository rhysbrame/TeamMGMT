package example.codeclan.com.footballmanager;

public class Fan extends Person {

    private double wallet;

    public Fan(String personName, int personAge, Sex sex, double wallet) {
        super (personName, personAge, sex);
        this.wallet = wallet;
    }

    public void setWallet(double money) {
        wallet = money;
    }

    public double getWallet() {
        return wallet;
    }

    public boolean buyTicket(int numberOfTickets, double ticketPrice) {
        double amountToDeduct = ticketPrice * numberOfTickets;
        if (getWallet() >= amountToDeduct) {
            double less = getWallet() - amountToDeduct;
            setWallet(less);
            return true;
        }
        return false;
    }
}