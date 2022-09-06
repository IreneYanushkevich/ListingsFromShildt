package main.java.com.irinayanushkevich.javacore.chapter10;

public class ExceptionDemo {
    static void compute(int a) throws MyException {

        System.out.println("Call of the method compute(" + a + ")");

        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal termination");
    }

    public static void main(String[] args) {

        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Exception is caught: " + e);
        }
    }
}

class MyException extends Exception {

    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
