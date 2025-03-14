package Problem4;

public class TestShapes {
    public static void main(String[] args) {
        // Create objects of different shapes
        Shape[] shapes = new Shape[5];
        shapes [0] = new Ellipse(5.0, 3.0);
        shapes [1] = new Triangle(3.0, 4.0, 5.0);
        shapes [2] = new EquilateralTriangle(6.0);
        shapes [3] = new Ellipse(7.0, 7.0); // Circle as a special case of Ellipse
        shapes [4] = new Circle(6.0); // Creating a circle with radius 6.0

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Print a blank line between each shape's output
        }

        double scaleFactor = 2.0;
        scaleShapes(shapes, scaleFactor);

        System.out.println("After scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Print a blank line between each shape's output
        }
    }
    // Static method to scale and array of Scalable objects
    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                Scalable scalable = (Scalable) shape;
                scalable.scale(factor);
            }
        }
    }
}
