package ua.prog.kiev.lesson2;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(5, 2));
        Circle circle = new Circle(new Point(0, 0), new Point(1, 1));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(1, 1));

        board.setFigure(1, triangle);
        board.setFigure(1, circle);
        board.setFigure(2, circle);
        board.setFigure(3, rectangle);

        board.printBoard();
        board.printArea();
    }
}
