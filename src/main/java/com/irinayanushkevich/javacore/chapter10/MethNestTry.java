package main.java.com.irinayanushkevich.javacore.chapter10;

public class MethNestTry {

    static void nestTry(int a) {

        try {
            if (a == 1) {
                a = a / (a - a);
            }
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of array bounds: " + e);
        }
    }

    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0: " + e);
        }
    }
}
