package example.codeclan.com.footballmanager;

public class Position {

    private PositionType positionType;
    private int positionNumber;

    public Position(PositionType positionType, int positionNumber) {
        this.positionType = positionType;
        this.positionNumber = positionNumber;
    }

    public void setPositionType(PositionType type) {
        positionType = type;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionNumber(int number) {
        positionNumber = number;
    }

    public int getPositionNumber(){
        return positionNumber;
    }
}