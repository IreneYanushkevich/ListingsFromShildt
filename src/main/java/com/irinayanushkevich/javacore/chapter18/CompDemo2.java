package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp2 implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr); // compare in reverse order
    }
}

class CompDemo2 {

    public static void main(String[] args) {

        MyComp2 mc = new MyComp2();
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
