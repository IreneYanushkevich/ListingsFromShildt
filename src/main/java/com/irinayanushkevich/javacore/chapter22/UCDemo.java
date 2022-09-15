package main.java.com.irinayanushkevich.javacore.chapter22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class UCDemo {

    public static void main(String[] args) throws Exception {

        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();

        if (d == 0) {
            System.out.println("Date information is not available");
        } else {
            System.out.println("Date: " + new Date(d));
        }
        System.out.println("Content type: " + hpCon.getContentType());

        d = hpCon.getExpiration();

        if (d == 0) {
            System.out.println("Expiration term information is not available");
        } else {
            System.out.println("Expiration term: " + new Date(d));
        }

        d = hpCon.getLastModified();

        if (d == 0) {
            System.out.println("last modification date information is not available");
        } else {
            System.out.println("last modification date: " + new Date(d));
        }

        long len = hpCon.getContentLengthLong();

        if (len == -1) {
            System.out.println("Content length is not available");
        } else {
            System.out.println("Content length: " + len);
        }
        if (len != 0) {

            System.out.println("===Content===");

            InputStream input = hpCon.getInputStream();

            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Content is not available");
        }
    }
}
