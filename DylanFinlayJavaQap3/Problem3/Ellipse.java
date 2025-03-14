package Problem3;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor, ensuring that a is the major axis (larger value) and b is the minor axis
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    // Compute the perimeter of the ellipse
    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // Compute the area of the ellipse
    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    // Getter for the major axis (a)
    public double getA() {
        return a;
    }

    // Getter for the minor axis (b)
    public double getB() {
        return b;
    }
}
