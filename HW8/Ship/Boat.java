package HW8.Ship;

public class Boat extends Ship{
    private float fuelConsumption;
    private String name;
    private float waterTankCapacity;

    public float getWaterTankCapacity() {
        return waterTankCapacity;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boat(String sailingArea, double deadweight) {
        super(sailingArea, deadweight);
    }
}
