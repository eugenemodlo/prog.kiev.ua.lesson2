package ua.prog.kiev.lesson2;

public class Circle extends Shape {
    private Point pointA = new Point(0, 0);
    private Point pointB = new Point(0, 0);

    public Circle(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Circle() {
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    private double getRadius() {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) +
                Math.pow(pointB.getX() - pointA.getX(), 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
}
