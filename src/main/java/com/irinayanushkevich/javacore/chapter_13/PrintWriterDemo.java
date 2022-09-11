package main.java.com.irinayanushkevich.javacore.chapter_13;

import java.io.PrintWriter;

class PrintWriterDemo {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);
        int i = -7;
        double d = 4.5e-7;

        pw.println("This is String");
        pw.println(i);
        pw.println(d);
    }
}
