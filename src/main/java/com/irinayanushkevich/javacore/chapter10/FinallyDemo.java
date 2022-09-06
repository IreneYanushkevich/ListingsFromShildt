package main.java.com.irinayanushkevich.javacore.chapter10;

public class FinallyDemo {
    static void procA() {

        try {
            System.out.println("In the body of the method procA()");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("Finally block in the method procA()");
        }
    }

    static void procB() {

        try {
            System.out.println("In the body of the method procB()");
            return;
        } finally {
            System.out.println("Finally block in the method procB()");
        }
    }

    static void procC() {

        try {
            System.out.println("In the body of the method procC()");
        } finally {
            System.out.println("Finally block in the method procC()");
        }
    }

    public static void main(String[] args) {

        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
        procB();
        procC();
    }
}
