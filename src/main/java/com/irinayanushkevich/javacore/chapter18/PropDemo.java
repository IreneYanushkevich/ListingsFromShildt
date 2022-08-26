package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

class PropDemo {

    public static void main(String[] args) {

        Properties capitals = new Properties();

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();

        for (Object name : states) {
            System.out.println("The capital of state " + name + " - " + capitals.getProperty((String) name) + ".");
        }
        System.out.println();

        String str = capitals.getProperty("Florida", " is not found");
        System.out.println("The capital of Florida " + str + ".");
    }
}
