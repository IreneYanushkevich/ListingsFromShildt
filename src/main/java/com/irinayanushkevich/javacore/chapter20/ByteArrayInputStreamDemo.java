package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;

class ByteArrayInputStreamDemo {

    public static void main(String[] args) throws IOException {

        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) input1.read());
        }
        System.out.println();

        int n = input2.available();

        for (int i = 0; i < n; i++) {
            System.out.print((char) input2.read());
        }
    }
}
