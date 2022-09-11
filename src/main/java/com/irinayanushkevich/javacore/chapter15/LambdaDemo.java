package main.java.com.irinayanushkevich.javacore.chapter15;

interface MyNumber {
    double getValue();
}

class LambdaDemo {

    public static void main(String[] args) {

        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println("Fix value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Random value: " + myNum.getValue());
        System.out.println("One more random value: " + myNum.getValue());

        // myNum = () -> "123.45"; mistake, types are not incompatible
    }
}
