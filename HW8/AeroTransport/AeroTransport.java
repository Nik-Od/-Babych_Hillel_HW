package HW8.AeroTransport;

public class AeroTransport {
    private String boardNumber;
    private String color;
    private float cruiseSpeed;
    private int weight;
    private float fuelConsumption;

    public AeroTransport(float cruiseSpeed, int weight, float fuelConsumption) {
        this.cruiseSpeed = cruiseSpeed;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
    }

    public void setCruiseSpeed(float cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBoardNumber() {
        return boardNumber;
    }
}
