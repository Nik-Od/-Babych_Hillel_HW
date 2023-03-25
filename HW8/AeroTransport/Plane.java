package HW8.AeroTransport;

public class Plane extends AeroTransport{
    private boolean IsPassenger;
    private int maxPersons;
    private float maxWeight;

    public Plane(float cruiseSpeed, int weight, float fuelConsumption) {
        super(cruiseSpeed, weight, fuelConsumption);
    }


    public boolean isPassenger() {
        return IsPassenger;
    }

    public int getMaxPersons() {
        return maxPersons;
    }

    public float getMaxWeight() {
        return maxWeight;
    }
}
