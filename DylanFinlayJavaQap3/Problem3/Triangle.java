package Problem3;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor to check if the sides form a valid triangle
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: Invalid triangle sides. Exitiing program.");
            System.exit(1); // Terminate the program if invalid triangle
        }
    }

    // Compute the perimeter of the triangle
    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    // Compute the area of the triangle using Heron's formula
    @Override
    public double computeArea() {
        double s = computePerimeter() / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
