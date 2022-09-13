package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

class CharArrayWriterDemo {

    public static void main(String[] args) throws IOException {

        CharArrayWriter f = new CharArrayWriter();
        String s = "This data should be input to the array";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Recording to the buffer error");
            return;
        }

        System.out.println("Buffer like a character string: ");
        System.out.println(f);
        System.out.println("Into array:");

        char[] c = f.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nOutput stream with FileWriter type:");

        try (FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }

        System.out.println("Installing to the initial state:");

        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f);
    }
}
