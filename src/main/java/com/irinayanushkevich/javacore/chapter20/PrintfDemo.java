package main.java.com.irinayanushkevich.javacore.chapter20;

class PrintfDemo {

    public static void main(String[] args) {

        System.out.println("Some number values in the different formats are below: ");
        System.out.printf("Different number formats: ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.println();
        System.out.printf("Default floating point number format: %f\n", 1234567.123);
        System.out.printf("Floating point format separated by commas: %,f\n", 1234567.123);
        System.out.printf("Default negative floating point number format: %,f\n", -1234567.123);
        System.out.printf("Another negative floating point number format: %,(f\n", -1234567.123);
        System.out.println();
        System.out.printf("Alignment of positive and negative numeric values:\n");
        System.out.printf("% ,.2f\n%,.2f\n", 1234567.123, -1234567.123);
    }
}
