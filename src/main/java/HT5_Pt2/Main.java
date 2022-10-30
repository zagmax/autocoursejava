package HT5_Pt2;

public class Main {
    public static void main(String[] args) {
        Oval oval = new Oval(3.1, 2);
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(2);
        Square square = new Square(2);
        System.out.println("Площадь круга\n" + circle.getSquare(circle)
                + "\nПлощадь Овала\n" + oval.getSquare(oval)
                + "\nПлощадь Прямоугольника\n" + rectangle.getSquare(rectangle)
                + "\nПлощадь Квадрата\n" + square.getSquare(square)
        );

    }
}
