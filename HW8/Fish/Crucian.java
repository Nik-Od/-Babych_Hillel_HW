package HW8.Fish;

public class Crucian extends Fish{
    private String location;
    private String name;
    private double weight;

    public Crucian(String fishType, double weight, float length) {
        super(fishType, weight, length);
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
