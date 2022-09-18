package main.java.com.irinayanushkevich.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo10 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alpha");
        myList.add("Betta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Ksy");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Spliterator<String> splItr = myStream.spliterator();
        Spliterator<String> splItr2 = splItr.trySplit();

        if (splItr2 != null) {
            System.out.println("Result from spliterator #2:");
            splItr2.forEachRemaining(System.out::println);
        }

        System.out.println("Result from spliterator #1:");
        splItr.forEachRemaining(System.out::println);
    }
}