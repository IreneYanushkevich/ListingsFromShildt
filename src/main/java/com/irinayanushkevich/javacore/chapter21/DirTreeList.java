package main.java.com.irinayanushkevich.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {

    public static void main(String[] args) {

        String dirname = "C:\\Users\\Irene\\IdeaProjects\\ShildtListings\\src\\main\\java\\com\\irinayanushkevich\\javacore";

        System.out.println("Directory tree which is beginning from the directory " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O error");
        }
    }
}
