package HW7;

public class EquilateralTriangle extends Triangle{
    private int sideA;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getPerimeter(int sideA){
        int perimeter = sideA * 4;
        return perimeter;
    }

}
