package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.ArrayList;

class ForEachDemo {

    public static void main(String[] args) {

        ArrayList<Integer> vals = new ArrayList<Integer>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.println("Initial contents of list array vals: ");

        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        int sum = 0;

        for (int v : vals) {
            sum += v;
        }
        System.out.println("Sum of numeric values: " + sum);
    }
}
