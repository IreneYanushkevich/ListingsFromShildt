package main.java.com.irinayanushkevich.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

class VarCapture {

    public static void main(String[] args) {

        int num = 10;

        MyFunc lambda = (n) -> {

            int v = num + n;
            // num++; - mistake, num can not be changed when lambda uses it
            return v;
        };

        // num = 9; - mistake, here it is also impossible
        System.out.println(lambda.func(5));
    }
}
