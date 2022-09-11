package main.java.com.irinayanushkevich.javacore.chapter15;

interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {

    public static void main(String[] args) {

        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Factorial of the number 3 = " + factorial.func(3));
        System.out.println("Factorial of the number 5 = " + factorial.func(5));
    }
}
