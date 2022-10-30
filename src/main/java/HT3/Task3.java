package HT3;

import java.util.Scanner;

public class Task3 {
    static int funcSum(int a, int b){
        return (a+b);
    }
    static int funcDeduction(int a, int b){
        return (a-b);
    }
    static int funcMulti(int a, int b){
        return (a*b);
    }
    static int funcDivide(int a, int b){       return (a/b);    }
    static int funcRemainder(int a, int b){
        return (a%b);
    }
    public static void main(String[] args)   {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
        System.out.println(a+" + "+b+" = "+funcSum(a,b));
        System.out.println(a+" - "+b+" = "+funcDeduction(a,b));
        System.out.println(a+" x "+b+" = "+funcMulti(a,b));
        if(b!=0) {System.out.println(a + " / " + b + " = " + funcDivide(a, b));
        System.out.println(a + " mod " + b + " = " + funcRemainder(a, b));}
        else System.out.println("Cannot divide and modulo by zero");

    }
}
