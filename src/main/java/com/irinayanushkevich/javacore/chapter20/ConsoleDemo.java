package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.Console;

class ConsoleDemo {

    public static void main(String[] args) {

        String str;
        Console con;

        con = System.console();

        if (con == null) {
            return;
        }

        str = con.readLine("Input a string: ");
        con.printf("Your string: %s\n", str);
    }
}
