package Problem2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor for Point with x and y coordinates
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default Constructor
    public Point(){}

    // Getter and setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set x and y at once
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method to represent the Point
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
