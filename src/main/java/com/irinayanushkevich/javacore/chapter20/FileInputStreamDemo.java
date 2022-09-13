package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {

    public static void main(String[] args) {

        int size;

        try (FileInputStream f = new FileInputStream("C:\\Users\\Irene\\IdeaProjects\\ShildtListings\\src\\main\\java\\com\\irinayanushkevich\\javacore\\chapter20\\FileInputStreamDemo.java")) {

            System.out.println("Common quantity of the available bytes: " + (size = f.available()));

            int n = size / 40;

            System.out.println("The first " + n + " bytes which had been read from the file in turn with the method read():");

            for (int i = 0; i < n; i++) {
                System.out.print((char)f.read());
            }
            System.out.println("Still available: " + f.available());
            System.out.println("Reading of the next " + n + " bytes in turn with the method read([]b):");

            byte[] b = new byte[n];

            if (f.read(b) != n) {
                System.err.println("It is impossible to read " + n + " bytes.");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("Still available: " + (size = f.available()));
            System.out.println("Skip half of the rest bytes with the method skip():");

            f.skip(size / 2);

            System.out.println("Still available: " + f.available());
            System.out.println("Reading " + n / 2 + " bytes which were put in the end of the array:");

            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.out.println("It is impossible to read " + n / 2 + " bytes.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("Still available: " + f.available());
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }
    }
}
