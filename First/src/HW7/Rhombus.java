package HW7;

public class Rhombus extends Quadrilateral{
    private int sideA;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getPerimeter(){
        int perimeter = sideA * 4;
        return perimeter;
    }

    @Override
    public void setQuadrilateralName(String quadrilateralName) {
        super.setQuadrilateralName(quadrilateralName);
    }

    @Override
    public void setFigureType(String figureType) {
        super.setFigureType(figureType);
    }
}
