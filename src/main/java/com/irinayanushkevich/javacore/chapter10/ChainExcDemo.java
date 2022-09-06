package main.java.com.irinayanushkevich.javacore.chapter10;

public class ChainExcDemo {
    static void demoProc() {

        NullPointerException e = new NullPointerException("the highest level");
        e.initCause(new ArithmeticException("the reason"));
        throw e;
    }

    public static void main(String[] args) {

        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Exception is caught: " + e);
            System.out.println("The root cause: " + e.getCause());
        }
    }
}

