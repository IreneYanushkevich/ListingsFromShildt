package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.*;

class BufferedReaderDemo {

    public static void main(String[] args) {

        String s = "This is copyright symbol &copy;, and &copy - is not.";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);

        boolean marked = false;

        int c;

        try (BufferedReader f = new BufferedReader(in)) {

            while ((c = f.read()) != -1) {

                switch (c) {

                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;

                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;

                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;

                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }
    }
}

