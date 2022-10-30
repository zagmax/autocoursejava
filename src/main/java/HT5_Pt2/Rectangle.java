package HT5_Pt2;

public class Rectangle extends Rectangular{

    double sideA,sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public double getSquare(Rectangle a) {
        return (a.sideA * a.sideB);
    }
}
