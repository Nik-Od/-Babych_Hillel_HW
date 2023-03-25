package HW8.Animals;

public class Hamster extends Animal{
    private double weight;
    private String regionOfOrigin;
    private String owner;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    public String getOwner() {
        return owner;
    }

    public Hamster(String type, String name) {
        super(type, name);
    }
}
