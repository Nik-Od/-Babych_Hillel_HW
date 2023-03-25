package HW8.FlightlessBird;

public class Duck extends FlightlessBird{
    private int flyingTime;
    private String name;
    private String meatTaste;

    public void setFlyingTime(int flyingTime) {
        this.flyingTime = flyingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeatTaste() {
        return meatTaste;
    }
}
