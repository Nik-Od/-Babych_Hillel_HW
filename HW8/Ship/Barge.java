package HW8.Ship;

public class Barge extends Ship{
    private String hullMaterial;
    private String CrewListType;
    private char numberOfCranes;

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setCrewListType(String crewListType) {
        CrewListType = crewListType;
    }

    public void setNumberOfCranes(char numberOfCranes) {
        this.numberOfCranes = numberOfCranes;
    }

    public Barge(String sailingArea, double deadweight) {
        super(sailingArea, deadweight);
    }
}
