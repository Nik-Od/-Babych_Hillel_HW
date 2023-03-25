package HW8.Fish;

public class Fish {
    private String fishType;
    private String location;
    private double weight;
    private float length;

    public String getFishType() {
        return fishType;
    }

    public String getLocation() {
        return location;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Fish(String fishType, double weight, float length) {
        this.fishType = fishType;
        this.weight = weight;
        this.length = length;
    }
}
