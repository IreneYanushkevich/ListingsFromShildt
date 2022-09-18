package main.java.com.irinayanushkevich.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phoneNum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phoneNum;

    NamePhone(String n, String p) {
        name = n;
        phoneNum = p;
    }
}

class StreamDemo5 {

    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("James", "555-5555", "Larry@gmail.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@gmail.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@gmail.com"));

        System.out.println("Initial elements from the list:");
        myList.stream().forEach((a) -> System.out.println(a.name + " " + a.phoneNum + " " + a.email));

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phoneNum));

        System.out.println("List of the names and phone numbers:");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " + a.phoneNum));

        System.out.println("List of the names and phone numbers with filter:");
        Stream<NamePhone> nameAndPhoneFilter = myList.stream().filter((a) -> a.name.equals("James")).map((a) -> new NamePhone(a.name, a.phoneNum));
        nameAndPhoneFilter.forEach((a) -> System.out.println(a.name + " " + a.phoneNum));
    }
}
