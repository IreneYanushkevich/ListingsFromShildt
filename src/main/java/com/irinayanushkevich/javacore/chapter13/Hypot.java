package main.java.com.irinayanushkevich.javacore.chapter13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Hypot {

    public static void main(String[] args) {

        double side1, side2, hypot;

        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("If side1 = " + side1 + " and side2 = " + side2 + " then hypotenuse is " + hypot);
    }
}
