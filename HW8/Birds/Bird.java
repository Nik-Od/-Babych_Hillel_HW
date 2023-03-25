package HW8.Birds;

public class Bird {
    private int maxFlyingDistance;
    private int wingLength;
    private String livingRegion;

    public void setMaxFlyingDistance(int maxFlyingDistance) {
        this.maxFlyingDistance = maxFlyingDistance;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public Bird(int maxFlyingDistance, String livingRegion) {
        this.maxFlyingDistance = maxFlyingDistance;
        this.livingRegion = livingRegion;
    }
}
