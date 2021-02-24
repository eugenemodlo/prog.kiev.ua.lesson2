package ua.prog.kiev.lesson2;

public class Rectangle extends Shape {
    private Point pointA = new Point(0,0);
    private Point pointB = new Point(0,0);
    private Point pointC = new Point(0,0);
    private Point pointD = new Point(0,0);

    public Rectangle(Point pointA, Point pointC) {
        this.pointA = pointA;
        this.pointC = pointC;

        this.pointB.setX(this.pointC.getX());
        this.pointB.setY(this.pointA.getY());

        this.pointD.setX(this.pointA.getX());
        this.pointD.setY(this.pointC.getY());
    }

    public Rectangle() {
    }

    @Override
    public double getPerimeter() {
        return (this.getSideLength(pointA, pointB) + this.getSideLength(pointB, pointC)) * 2;
    }

    @Override
    public double getArea() {

        return this.getSideLength(pointA, pointB) * this.getSideLength(pointB, pointC);
    }

    private double getSideLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) +
                Math.pow(pointB.getX() - pointA.getX(), 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pointA=" + pointA +
                ", pointC=" + pointC +
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

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
}
