package HT4;

public class Task1 {
    public static void main (String[] args) {
        String first = "PHP Exercises and ";
        String second = "Python Exercises";
        String result = first + second;
        System.out.println("The concatenated string with replacements: " + result.replaceAll("[pP]",""));
    }
}
