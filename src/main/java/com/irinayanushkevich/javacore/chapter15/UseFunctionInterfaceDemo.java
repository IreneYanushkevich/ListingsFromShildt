package main.java.com.irinayanushkevich.javacore.chapter15;

import java.util.function.Function;

class UseFunctionInterfaceDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> factorial = (n) -> {

            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Factorial of 3 = " + factorial.apply(3));
        System.out.println("Factorial of 5 = " + factorial.apply(5));
    }
}
