package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo {

    public static void main(String[] args) {

        String path = "C:\\Users\\Irene\\IdeaProjects\\ShildtListings\\src\\main\\java\\com\\irinayanushkevich\\" +
                "javacore\\chapter20\\FileReaderDemo.java";

        try (FileReader fr = new FileReader(path)) {

            int c;

            while ((c = fr.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Input/Output error");
        }
    }
}
