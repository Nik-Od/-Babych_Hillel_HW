package HW8.Transport;

public class Transport {
    private String type;
    private String brand;
    private String fuelType;

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Transport(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
        System.out.println(brand + " should be fueled with " + fuelType);
    }
}
