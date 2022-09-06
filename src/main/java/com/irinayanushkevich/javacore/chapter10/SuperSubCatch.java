package main.java.com.irinayanushkevich.javacore.chapter10;

public class SuperSubCatch {

    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Catching exceptions of the general class Exception.");
            // } catch (ArithmeticException e) {
            System.out.println("This catch statement will not be reached: subclass of ArithmeticException is derived\n" +
                    "from class Exception");
        }
    }
}