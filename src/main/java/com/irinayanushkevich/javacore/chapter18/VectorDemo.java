package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>(3, 2);

        System.out.println("Initial vector size: " + v.size());
        System.out.println("Initial vector capacity: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("The capacity of the vector after entering four elements: " + v.capacity());

        v.addElement(5);
        System.out.println("Current vector capacity: " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Current vector capacity: " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Current vector capacity: " + v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println("The first element of the vector: " + v.firstElement());
        System.out.println("The last element of the vector: " + v.lastElement());

        if (v.contains(3)) {
            System.out.println("Vector contains 3.");
        }

        Enumeration<Integer> vEnum = v.elements();
        System.out.print("Vector elements: ");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }

        System.out.println();

       /* Iterator<Integer> vItr = v.iterator();
        System.out.print("Vector elements: ");
        while (vItr.hasNext()) {
            System.out.print(vItr.next() + " ");
        }

        System.out.println();

        System.out.print("Vector elements: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println(); */
    }
}
