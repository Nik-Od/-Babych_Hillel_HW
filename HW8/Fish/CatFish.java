package HW8.Fish;

public class CatFish extends Fish {
    private int whiskersLength;
    private String name;

    public CatFish(String fishType, double weight, float length) {
        super(fishType, weight, length);
    }

    public void setWhiskersLength(int whiskersLength) {
        this.whiskersLength = whiskersLength;
    }

    public void setName(String name) {
        this.name = name;
    }
}
