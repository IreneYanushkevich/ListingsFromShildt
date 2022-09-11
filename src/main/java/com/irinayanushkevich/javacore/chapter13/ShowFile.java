package main.java.com.irinayanushkevich.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile {

    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Using: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Opening file is impossible");
            return;
        }

       /* try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File reading error");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("File closing error");
        }
    }*/
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File reading error");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("File closing error");
            }
        }
    }
}
