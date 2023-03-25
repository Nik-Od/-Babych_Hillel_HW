package HW8.Transport;

public class Bus extends Transport{
    private String mainStation;
    private char number;
    private String driver;

    public char getNumber() {
        return number;
    }

    public void setMainStation(String mainStation) {
        this.mainStation = mainStation;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Bus(String brand, String fuelType) {
        super(brand, fuelType);
    }


}
