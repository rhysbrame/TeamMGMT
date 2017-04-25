package example.codeclan.com.footballmanager;

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
