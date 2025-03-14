package Problem3;

public class Circle extends Ellipse {

    // Constructor for Circle class, where the radius is the same for both axes
    public Circle(double radius) {
        super(radius, radius); // Passing the same radius for both axes to the Ellipse constructor
        this.name = "Circle"; // Change name to "Circle"
    }

    // Override the computePerimeter method for a circle (Circumference)
    @Override
    public double computePerimeter() {
        return 2 * Math.PI * getA(); // Circumference of a circle is 2 * pi * radius
    }

    // Override the computeArea method for a circle
    @Override
    public double computeArea() {
        return Math.PI * Math.pow(getA(), 2); // Area of a circle is pi * radius^2
    }
    
}
