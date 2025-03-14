package Problem3;

abstract class Shape {
    protected String name;

    // Constructor to assign the shape's name
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for perimeter and area
    public abstract double computePerimeter();
    public abstract double computeArea();

    // Overriding toString to print the name, area, and perimeter
    @Override
    public String toString() {
        return "Shape:" + name + "\nArea:" + computeArea() + "\nPerimeter:" + computePerimeter();
    }
}
