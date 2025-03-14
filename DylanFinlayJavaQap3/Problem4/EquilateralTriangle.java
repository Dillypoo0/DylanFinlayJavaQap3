package Problem4;

public class EquilateralTriangle extends Triangle{
    
    public EquilateralTriangle(double side) {
        super(side, side, side); // Passing the same side lenght to the parent constructor
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        super.scale(factor); // Scale all three sides
    }
}
