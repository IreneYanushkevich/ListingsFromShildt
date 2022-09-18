package main.java.com.irinayanushkevich.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo9 {

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

        splItr.tryAdvance(System.out::println);
    }
}
