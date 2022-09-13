package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.File;

class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\Irene\\IdeaProjects\\ShildtListings\\src\\main" +
                "\\java\\com\\irinayanushkevich\\javacore\\chapter20\\COPYRIGHT.txt");

        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Absolut path: " + f1.getAbsolutePath());
        p("Parent catalog: " + f1.getParent());
        p(f1.exists() ? "exist" : "doesn't exist");
        p(f1.canWrite() ? "available for recording" : "not available for recording");
        p(f1.canRead() ? "available for reading" : "not available for reading");
        p(f1.isDirectory() ? "catalog" : "not a catalog");
        p(f1.isFile() ? "simple file" : "can be of the named catalog");
        p(f1.isAbsolute() ? "absolute" : "not an absolute");
        p("The last changes in the file: " + f1.lastModified());
        p("Size: " + f1.length() + " bytes");
    }
}
