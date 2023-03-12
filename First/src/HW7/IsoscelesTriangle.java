package HW7;

public class IsoscelesTriangle extends Triangle {
    private int equalSide;
    private int sideB;

    public void setEqualSide(int equalSide) {
        this.equalSide = equalSide;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getPerimeter(int equalSide, int sideB) {
        int perimeter = equalSide * 2 + sideB;
        return perimeter;
    }
}
