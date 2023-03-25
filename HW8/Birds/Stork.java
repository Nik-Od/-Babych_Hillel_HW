package HW8.Birds;

public class Stork extends Bird{
    private String name;
    private String beakLength;

    public void setName(String name) {
        this.name = name;
    }

    public String getBeakLength() {
        return beakLength;
    }

    public Stork(int maxFlyingDistance, String livingRegion) {
        super(maxFlyingDistance, livingRegion);
    }
}
