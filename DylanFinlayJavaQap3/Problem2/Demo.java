package Problem2;

public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1.0f, 2.0f);
        System.out.println("Point:" + p);

        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint:" + mp);

        mp.move();
        System.out.println("After moving:" + mp);

        mp.setSpeed(1.0f, 1.0f);
        mp.move();
        System.out.println("After moving again:" + mp);
    }
}
