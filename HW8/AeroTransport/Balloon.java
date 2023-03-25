package HW8.AeroTransport;

public class Balloon extends AeroTransport{

    private int maxHeight;
    private int maxPersonsOnBoard;
    private String name;
    public Balloon(float cruiseSpeed, int weight, float fuelConsumption) {
        super(cruiseSpeed, weight, fuelConsumption);
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPersonsOnBoard() {
        return maxPersonsOnBoard;
    }
}
