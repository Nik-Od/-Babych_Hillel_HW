package HW8.AeroTransport;

public class Helicopter extends AeroTransport{

    private float rotorDiameter;
    private String helicopterType;
    private String name;
    private Helicopter(float cruiseSpeed, int weight, float fuelConsumption) {
        super(cruiseSpeed, weight, fuelConsumption);
    }

    public float getRotorDiameter() {
        return rotorDiameter;
    }

    public void setName(String name) {
        name = name;
    }

    public String getHelicopterType() {
        return helicopterType;
    }
}
