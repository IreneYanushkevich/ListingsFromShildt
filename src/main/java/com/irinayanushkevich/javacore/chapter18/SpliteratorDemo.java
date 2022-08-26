package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

class SpliteratorDemo {

    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<Double>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("List array vals content: ");

        Spliterator<Double> spltitr = vals.spliterator();

        while (spltitr.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();

        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        System.out.println("List array sqrs content: ");

        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
