package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo2B {

    public static void main(String[] args) {

        Comparator<String> c1 = (aStr, bStr) -> aStr.substring(aStr.lastIndexOf(' ')).compareToIgnoreCase(bStr.substring(bStr.lastIndexOf(' ')));

        TreeMap<String, Double> tm = new TreeMap<String, Double>(c1.thenComparing((aStr, bStr) -> aStr.compareToIgnoreCase(bStr)));

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jain Backer", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("New John Doe account balance: " + tm.get("John Doe"));
    }
}
