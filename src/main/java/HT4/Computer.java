package HT4;

// AKA Task2

public class Computer{
private String Brand;
private double ScreenSize;
private int CoreNum;
private String Type;

public Computer(String name, double size){
    this.Brand=name;
    this.ScreenSize=size;
}

    public static void main(String[] args){

        Computer PC1 = new Computer("DELL",23.5 );
        Computer PC2 = new Computer("Samsung",28);
        PC1.CoreNum=6;
        PC2.CoreNum=8;
        PC1.Type="Laptop";
        PC2.Type="Desktop";

    }
}



