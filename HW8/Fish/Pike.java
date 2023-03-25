package HW8.Fish;

public class Pike extends Fish{
    private String location;
    private String name;
    private double weight;

    public Pike(String fishType, double weight, float length) {
        super(fishType, weight, length);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
