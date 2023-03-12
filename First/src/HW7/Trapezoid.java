package HW7;

public class Trapezoid extends Quadrilateral{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public int getPerimeter(int sideA, int sideB, int sideC, int sideD){
        int perimeter = sideA + sideB + sideC + sideD;
        return perimeter;
    }

    @Override
    public void setFigureType(String figureType) {
        super.setFigureType(figureType);
    }

    @Override
    public void setQuadrilateralName(String quadrilateralName) {
        super.setQuadrilateralName(quadrilateralName);
    }
}
