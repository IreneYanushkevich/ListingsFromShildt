package main.java.com.irinayanushkevich.javacore.chapter_13;

import java.io.FileInputStream;
import java.io.IOException;

class ShowFile2 {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Using: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);

        /*} catch (FileNotFoundException e) {
            System.out.println("Opening is not found");*/
        } catch (IOException e) {
            System.out.print("Input/Output error");
        } finally {

            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("File closing error");
            }
        }
    }
}