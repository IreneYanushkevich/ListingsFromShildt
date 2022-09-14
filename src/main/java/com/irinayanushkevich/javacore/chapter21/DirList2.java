package main.java.com.irinayanushkevich.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirList2 {

    public static void main(String[] args) {

        String dirname = "C:\\Users\\Irene\\IdeaProjects\\ShildtListings";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                return Files.isDirectory(filename);
            }
        };

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname), how)) {

            System.out.println("Directory: " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("      ");
                }
                System.out.println(entry.getName(entry.getNameCount() - 1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " is not a directory");
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }
    }
}
