package Problem2;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor for MovablePoint with x, y, xSpeed and ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Default Constructor
    public MovablePoint() {
    }

    // Getter and setter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter and setter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set xSpeed and ySpeed at once
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // toString method to represent the MovablePoint
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "), speed= (" + xSpeed + "," + ySpeed + ")";
    }

    // Method to move the MovablePoint
    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
