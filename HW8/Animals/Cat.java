package HW8.Animals;

public class Cat extends Animal{
   private String color;
   private String breed;
   private float hairLength;

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setHairLength(float hairLength) {
        this.hairLength = hairLength;
    }

    public Cat(String type, String name) {
        super(type, name);
    }

    public Cat(String type, String name, String breed, float hairLength) {
        super(type, name);
        this.breed = breed;
        this.hairLength = hairLength;
        System.out.println("This " + type + " has a hair length - " + hairLength);
    }
}
