package Problem4;

public class Circle extends Ellipse {
    
    public Circle(double radius) {
        super(radius, radius); // Passing the same radius for both axes to the Ellipse constructor
        this.name = "Circle";
    }

    @Override
    public void scale(double factor) {
        super.scale(factor); // Scale the radius
    }
 }
