package HW8.Ship;

public class Ship {
    private String sailingArea;
    private int imoNumber;
    private double deadweight;

    public int getImoNumber() {
        return imoNumber;
    }

    public double getDeadweight() {
        return deadweight;
    }
    public void setSailingArea(String sailingArea) {

        this.sailingArea = sailingArea;
    }

    public Ship(String sailingArea, double deadweight) {
        this.sailingArea = sailingArea;
        this.deadweight = deadweight;
        System.out.println("Any info about ship");
    }
}
