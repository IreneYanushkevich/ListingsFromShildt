package main.java.com.irinayanushkevich.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class PathDemo {

    public static void main(String[] args) {

        Path filepath = Paths.get("src\\main\\java\\com" +
                "\\irinayanushkevich\\javacore\\chapter21\\t.txt");

        System.out.println("File name: " + filepath.getName(filepath.getNameCount() -1));
        System.out.println("Path to file: " + filepath);
        System.out.println("Absolut path to file: " + filepath.toAbsolutePath());
        System.out.println("Parent directory: " + filepath.getParent());

        if (Files.exists(filepath)) {
            System.out.println("File exists");
        } else {
            System.out.println("File doesn't exist");
        }

        try {

            if (Files.isHidden(filepath)) {
                System.out.println("File is hidden");
            } else {
                System.out.println("File is not hidden");
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }

        Files.isWritable(filepath);
        System.out.println("File is available for writing");

        Files.isReadable(filepath);
        System.out.println("File is available for reading");

        try {

            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attribs.isDirectory()) {
                System.out.println("This isa  directory");
            } else {
                System.out.println("This is not a directory");
            }

            if (attribs.isRegularFile()) {
                System.out.println("This is a regular file");
            } else {
                System.out.println("This is not a regular file");
            }

            if (attribs.isSymbolicLink()) {
                System.out.println("This is a symbolic link");
            } else {
                System.out.println("This is not a symbolic link");
            }

            System.out.println("The last time of file modification: " + attribs.lastModifiedTime());
            System.out.println("File size: " + attribs.size() + " bytes");

        } catch (IOException e) {
            System.out.println("Reading attributes error: " + e);
        }
    }
}
