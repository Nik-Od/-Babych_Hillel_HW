package HW8.Animals;

public class Dog extends Animal{

    private String animalFamily;
    private String breed;
    private float teethLength;

    public String getAnimalFamily() {
        return animalFamily;
    }

    public String getBreed() {
        return breed;
    }

    public float getTeethLength() {
        return teethLength;
    }

    public Dog(String type, String name) {
        super(type, name);
    }
}
