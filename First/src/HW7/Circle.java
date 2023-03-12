package HW7;

public class Circle extends Figures{
    private int radius;
    private String circleName;

    @Override
    public void setFigureType(String figureType) {
        super.setFigureType(figureType);
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }
    public double getPerimeter(double radius){
        double perimeter = 2 * 3.14 * radius;
        return radius;
    }
}
