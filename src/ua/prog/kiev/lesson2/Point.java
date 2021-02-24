package ua.prog.kiev.lesson2;

public class Point {
    double x;
    double y;

    public Point(double xCoordinate, double yCoordinate) {
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
