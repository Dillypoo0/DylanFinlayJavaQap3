package Problem3;

public class Equilateral extends Triangle {
    
    //Constructor for equilateral triangle, all sides are equal
    public Equilateral(double side) {
        super(side, side, side); // Passing the same side length to the parent constructor
        this.name = "Equilateral Triangle"; // Change name to "Equilateral Triangle"
    }

    // Override the computePerimeter and computeArea methods to use the same side for all sides
    @Override
    public double computePerimeter() {
        return 3 * getSide1(); // Perimeter is 3 times the side length
    }

    @Override
    public double computeArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getSide1(), 2);
    }
    
    // Method to access side1 (since it's inherited from Triangle)
    public double getSide1() {
        return super.computePerimeter() / 3;
    }
    
}
