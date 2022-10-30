package HT5_Pt1;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class Vector {

    public static void main(String[] args) {

        Vector a = new Vector(1, 1, 1);
        Vector b = new Vector(1, 1, 1);
        System.out.println("Массив на 5 рандомных векторов");
        VecArrPrint(Rand());
        System.out.println("Длина вектора А(1,1,1)\n " + a.Length(a));
        System.out.println("Длина рандомного вектора \n " + a.Length());
        System.out.println("Скалярное произведение вектора А(1,1,1) \n " + a.Dot());
        System.out.println("Скалярное произведение рандомного вектора \n " + a.Dot(a, b));

    }

    public double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double Length(Vector a) {
        return sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2) + Math.pow(a.z, 2));
    }

    public double Dot(Vector a, Vector b) {
        return (a.x * b.x + a.y * b.y + a.z * b.z);
    }

    public double Length() {
        Vector a = new Vector(random(), random(), random());
        return sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2) + Math.pow(a.z, 2));
    }

    public double Dot() {
        Vector a = new Vector(random(), random(), random());
        Vector b = new Vector(random(), random(), random());
        return (a.x * b.x + a.y * b.y + a.z * b.z);
    }

    public static void VecArrPrint(Vector[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + ". " + a[i].x + " " + a[i].y + " " + a[i].z + " ");

        }
    }

    public static Vector[] Rand() {
        Vector rand[] = new Vector[5];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = new Vector(random(), random(), random());
        }
        return rand;
    }
}

