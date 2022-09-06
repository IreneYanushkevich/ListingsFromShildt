package main.java.com.irinayanushkevich.javacore.chapter10;

public class MultiCatch {

    public static void main(String[] args) {

        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            vals[10] = 19;
            int result = a / b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is caught: " + e);
        }
        System.out.println("After multiple catching.");
    }
}