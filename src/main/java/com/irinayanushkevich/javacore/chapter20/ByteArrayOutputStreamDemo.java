package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamDemo {

    public static void main(String[] args) {

        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data should be input into array";
        byte[] buf = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Writing to the buffer error.");
            return;
        }

        System.out.println("Buffer as a character string:");
        System.out.println(f);
        System.out.println("To the array:");

        byte[] b = f.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nTo the output stream with type OutputStream:");

        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {

            f.writeTo(f2);

        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
            return;
        }
        System.out.println("Installing to the initial state:");

        f.reset();

        for (int i = 0; i < 3; i++) {

            f.write('X');
        }
        System.out.println(f);
    }
}
