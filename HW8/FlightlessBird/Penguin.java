package HW8.FlightlessBird;

public class Penguin extends FlightlessBird{
    private String color;
    private String name;
    private String region;
    private int toes;

    public void setName(String name) {
        this.name = name;
    }

    public void setToes(int toes) {
        this.toes = toes;
    }

    public String getColor() {
        return color;
    }

    public String getRegion() {
        return region;
    }
}
