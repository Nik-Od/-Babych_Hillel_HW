package HW8.Animals;

public class Animal {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("This is " + name + " and " + name + "'s type is " + type);
    }

}
