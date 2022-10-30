package HT4;
// AKA Task 3
/*
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}
*/
public class Rectangle {
private double width;
private double height;
public double area(){return this.width*this.height;}
    public static void main(String[] args) {
       Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
       System.out.println("myRect's area is " + myRect.area());
    }
}