package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.ArrayList;

class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of list array al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("The size of the list array al after entering the elements: " + al.size());
        System.out.println("List array al content: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("The size of the list array al after deleting elements: " + al.size());
        System.out.println("List array al content: " + al);
    }
}
