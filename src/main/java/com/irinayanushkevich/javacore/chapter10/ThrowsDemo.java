package main.java.com.irinayanushkevich.javacore.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("In the body of the method throwOne().");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String[] args) {

        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception is caught: " + e);
        }
    }
}