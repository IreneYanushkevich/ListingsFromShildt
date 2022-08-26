package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.HashSet;
// import java.util.LinkedHashSet;

class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        // LinkedHashSet<String> hs = new LinkedHashSet<String>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gama");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
