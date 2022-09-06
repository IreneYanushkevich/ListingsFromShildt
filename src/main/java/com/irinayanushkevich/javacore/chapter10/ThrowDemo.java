package main.java.com.irinayanushkevich.javacore.chapter10;

public class ThrowDemo {

    static void demoProc() {

        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("Exception is caught at the body of method demoProc().");
            throw e;
        }
    }

    public static void main(String[] args) {

        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Second catching: " + e);
        }
    }
}