package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {

    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirListOnly {

    public static void main(String[] args) {

        String dirname = "C:\\Users\\Irene\\IdeaProjects\\ShildtListings\\" +
                "src\\main\\java\\com\\irinayanushkevich\\javacore\\chapter20\\";
        File f1 = new File(dirname); // catalog
        FilenameFilter only = new OnlyExt("txt");
        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
