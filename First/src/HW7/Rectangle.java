package HW7;

public class Rectangle extends Quadrilateral{
    private int sideA;
    private int sideB;
    public int getPerimeter(int sideA, int sideB){
        int perimeter = sideA * 2 + sideB * 2;
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
