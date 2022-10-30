package HT5_Pt2;

public class Oval extends Round {
    double minorAxis, majorAxis;

    public Oval(double minorAxis, double majorAxis) {
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }


    public double getSquare(Oval a) {
        return ((a.minorAxis * a.majorAxis) / 2 * pi);
    }
}
