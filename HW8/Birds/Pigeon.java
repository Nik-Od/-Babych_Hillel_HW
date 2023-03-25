package HW8.Birds;

public class Pigeon extends Bird{
    private String location;
    private int idNumber;
    private char liveDuration;

    public String getLocation() {
        return location;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setLiveDuration(char liveDuration) {
        this.liveDuration = liveDuration;
    }


    public Pigeon(int maxFlyingDistance, String livingRegion) {
        super(maxFlyingDistance, livingRegion);
    }
}
