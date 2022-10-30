package HT5_Pt2;

public class Circle extends Round {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare(Circle a) {
        return ((a.radius * a.radius) / 2 * pi);
    }

}
