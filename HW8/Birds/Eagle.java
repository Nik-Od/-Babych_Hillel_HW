package HW8.Birds;

public class Eagle extends Bird{
    private String color;
    private String usualPrey;
    private int flyingHeight;

    public String getColor() {
        return color;
    }

    public int getFlyingHeight() {
        return flyingHeight;
    }

    public void setUsualPrey(String usualPrey) {
        this.usualPrey = usualPrey;
    }

    public Eagle(int maxFlyingDistance, String livingRegion, String usualPrey, int flyingHeight) {
        super(maxFlyingDistance, livingRegion);
        this.usualPrey = usualPrey;
        this.flyingHeight = flyingHeight;
    }

    public Eagle(int maxFlyingDistance, String livingRegion) {
        super(maxFlyingDistance, livingRegion);
    }
}
