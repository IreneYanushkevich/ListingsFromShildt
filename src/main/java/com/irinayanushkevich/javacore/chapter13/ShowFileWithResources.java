package main.java.com.irinayanushkevich.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFileWithResources {

    public static void main(String[] args) {

        int i;

        if (args.length != 1) {
            System.out.println("Using: ShowFile file_name");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();

                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Input/Output error");
        }
    }
}
