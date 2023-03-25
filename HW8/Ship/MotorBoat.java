package HW8.Ship;

public class MotorBoat extends Ship{
    private String name;
    private String captainName;
    private char amountOfCrew;

    public MotorBoat(String sailingArea, double deadweight) {
        super(sailingArea, deadweight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public char getAmountOfCrew() {
        return amountOfCrew;
    }

}
