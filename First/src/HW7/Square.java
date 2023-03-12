package HW7;

public class Square extends Quadrilateral{
    private int sideA;
    public int getPerimeter(int sideA){
        int perimeter = sideA * 4;
        return perimeter;
    }

    @Override
    public String getFigureName() {
        return super.getFigureName();
    }

}
