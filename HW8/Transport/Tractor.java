package HW8.Transport;

public class Tractor extends Transport{
    private float fuelConsumption;
    private String companyName;
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Tractor(String brand, String fuelType) {
        super(brand, fuelType);
    }
}
