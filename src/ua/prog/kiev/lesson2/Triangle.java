package ua.prog.kiev.lesson2;

public class Triangle extends Shape {
    private Point pointA = new Point(0, 0);
    private Point pointB = new Point(0, 0);
    private Point pointC = new Point(0, 0);

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {
    }

    @Override
    public double getPerimeter() {

        return this.getSideLength(pointA, pointB) +
                this.getSideLength(pointB, pointC) +
                this.getSideLength(pointC, pointA);
    }

    private double getSideLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) +
                Math.pow(pointB.getX() - pointA.getX(), 2));
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()) -
                (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY()));
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

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
