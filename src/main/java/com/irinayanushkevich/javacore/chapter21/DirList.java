package main.java.com.irinayanushkevich.javacore.chapter21;
//C:\Users\Irene\IdeaProjects\ShildtListings\src\main\java\com\irinayanushkevich\javacore
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirList {

    public static void main(String[] args) {

        String dirname = "C:\\Users\\Irene\\IdeaProjects\\ShildtListings";

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname), "**.{txt,class}")) {

            System.out.println("Directory " + dirname);

            for (Path entry : dirstrm) {

                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory()) {
                    System.out.print("<DIR>");
                } else {
                    System.out.print("     ");
                }
                System.out.println(entry.getName(entry.getNameCount()-1));
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
