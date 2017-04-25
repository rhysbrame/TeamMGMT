package example.codeclan.com.footballmanager;

/**
 * Created by user on 25/04/2017.
 */

public class Stadium {

    private String stadiumName;
    private int stadiumCapacity;
    private double ticketPrice;

    public Stadium(String stadiumName, int stadiumCapacity, double ticketPrice) {
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
        this.ticketPrice = ticketPrice;
    }

    public void setStadiumName(String name) {
        stadiumName = name;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumCapacity(int capacity) {
        stadiumCapacity = capacity;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setTicketPrice(double price) {
        ticketPrice = price;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
