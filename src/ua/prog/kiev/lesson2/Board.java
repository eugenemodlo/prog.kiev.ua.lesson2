package ua.prog.kiev.lesson2;

public class Board {
    private Shape[] board = new Shape[4];

    public void setFigure(int quadrant, Shape figure) {
        if (this.board[quadrant - 1] == null) {
            this.board[quadrant - 1] = figure;
        } else {
            System.out.println("This quadrant not empty!");
        }
    }

    public void removeFigure(int quadrant) {
        this.board[quadrant - 1] = null;
    }

    public void printBoard() {
        for (Shape shape : this.board) {
            System.out.println(shape);
        }
    }

    public void printArea() {
        double area = 0;
        for (Shape shape : this.board) {
            area = area + shape.getArea();
        }
        System.out.println(area);
    }
}
