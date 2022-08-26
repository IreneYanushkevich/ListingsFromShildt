package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.TreeSet;

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
