package HT7;

interface StringFunction {
    String run(String str);
}

public class OptionalT4 { //+
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s.concat("!");
        StringFunction ask = (s) -> s.concat("?");
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.print(result);
    }
}

