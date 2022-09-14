package main.java.com.irinayanushkevich.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

class NIOCopy {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Using: from where and where to copy");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }
    }
}
