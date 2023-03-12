package HW7;

public abstract class Quadrilateral extends Figures {
    private String quadrilateralName;
    private String quadrilateralType;

    public void setQuadrilateralName(String quadrilateralName) {
        this.quadrilateralName = quadrilateralName;
    }

    @Override
    public void setFigureType(String figureType) {
        super.setFigureType(figureType);
    }

    public String getQuadrilateralType() {
        return quadrilateralType;
    }
}
