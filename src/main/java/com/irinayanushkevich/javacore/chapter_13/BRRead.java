package main.java.com.irinayanushkevich.javacore.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead {

    public static void main(String[] args) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, 'q' - for exit.");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
