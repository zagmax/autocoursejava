package HT5_Pt2;

public class Square extends Rectangular {

    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSquare(Square a) {
        return (a.side * a.side);
    }
}
