package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);

        System.out.println("The list is sorted in reverse order: ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(ll);

        System.out.println("List shuffled: ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Min: " + Collections.min(ll));
        System.out.println("Max: " + Collections.max(ll));
    }
}
