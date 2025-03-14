package Problem3;

public class TestShapes {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape[] shapes = new Shape[5];
        shapes[0] = new Ellipse(5.0, 3.0);
        shapes[1] = new Triangle(3.0, 4.0, 5.0);
        shapes[2] = new Equilateral(6.0);
        shapes[3] = new Ellipse(7.0, 7.0); // Circle as a special case of Ellipse
        shapes[4] = new Circle(6.0); // Creating a circle with radius 6.0
        
        // Loop through each shape in the array and print its details
        for(Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Print a blank line between each shape's output
        }
    }
}
