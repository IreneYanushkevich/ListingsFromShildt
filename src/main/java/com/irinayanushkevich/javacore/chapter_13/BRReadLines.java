package main.java.com.irinayanushkevich.javacore.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRReadLines {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' for exit.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
