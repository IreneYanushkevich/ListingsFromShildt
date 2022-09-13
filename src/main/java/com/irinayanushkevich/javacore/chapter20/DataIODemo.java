package main.java.com.irinayanushkevich.javacore.chapter20;

import java.io.*;

class DataIODemo {

    public static void main(String[] args) {

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.txt"))) {

            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        } catch (FileNotFoundException e) {
            System.out.println("It is impossible to open file");
            return;
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.txt"))) {

            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Received values: " + d + " " + i + " " + b);

        } catch (FileNotFoundException e) {
            System.out.println("It is impossible to open input file");
            return;
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }
    }
}
