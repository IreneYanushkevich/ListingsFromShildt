package main.java.com.irinayanushkevich.javacore.chapter18;

import java.io.*;
import java.util.Properties;

class Phonebook {

    public static void main(String[] args) throws IOException {

        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fin = null;
        boolean changed = false;
        String name, number;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignoring
        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("File read error.");
        }

        do {
            System.out.println("Input name ('Exit' for finish): ");
            name = br.readLine();
            if (name.equals("Exit")) {
                continue;
            }
            System.out.println("Input number: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("Exit"));

        if (changed) {
            FileOutputStream fOut = new FileOutputStream("phonebook.dat");
            ht.store(fOut, "Phone Book");
            fOut.close();
        }

        do {
            System.out.println("Input name for searching ('Exit' for finish): ");
            name = br.readLine();
            if (name.equals("Exit")) {
                continue;
            }
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("Exit"));

        System.out.println(ht);
    }
}
