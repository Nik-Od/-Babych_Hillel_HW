package HW8.Transport;

public class Car extends Transport{
    private String manufacturer;
    private int price;
    private float insurancePrice;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInsurancePrice(float insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Car(String brand, String fuelType) {
        super(brand, fuelType);
    }
}
