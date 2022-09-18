package main.java.com.irinayanushkevich.javacore.chapter29;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail7 {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmail7(String n, String p, String e) {
        name = n;
        phoneNum = p;
        email = e;
    }
}

class NamePhone7 {
    String name;
    String phoneNum;

    NamePhone7(String n, String p) {
        name = n;
        phoneNum = p;
    }
}

class StreamDemo7 {

    public static void main(String[] args) {

        ArrayList<NamePhoneEmail7> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail7("Larry", "555-5555", "Larry@gmail.com"));
        myList.add(new NamePhoneEmail7("James", "555-4444", "James@gmail.com"));
        myList.add(new NamePhoneEmail7("Mary", "555-3333", "Mary@gmail.com"));
        myList.add(new NamePhoneEmail7("Mary", "555-3333", "Mary@gmail.com"));

        Stream<NamePhone7> nameAndPhone = myList.stream().map((a) -> new NamePhone7(a.name, a.phoneNum));
        List<NamePhone7> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phoneNumbers in the list with the type of List:");
        for (NamePhone7 np : npList) {
            System.out.println(np.name + " : " + np.phoneNum);
        }

        nameAndPhone = myList.stream().map((a) -> new NamePhone7(a.name, a.phoneNum));
        Set<NamePhone7> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Names and phoneNumbers in the set with the type of Set:");
        for (NamePhone7 np : npSet) {
            System.out.println(np.name + " : " + np.phoneNum);
        }

        nameAndPhone = myList.stream().map((a) -> new NamePhone7(a.name, a.phoneNum));
        LinkedList<NamePhone7> npLList = nameAndPhone.collect(() -> new LinkedList<>(),
                (list, element) -> list.add(element), (listA, listB) -> listA.addAll(listB));

        System.out.println("Names and phoneNumbers in the list with the type of LinkedList:");
        for (NamePhone7 np : npLList) {
            System.out.println(np.name + " : " + np.phoneNum);
        }

        nameAndPhone = myList.stream().map((a) -> new NamePhone7(a.name, a.phoneNum));
        HashSet<NamePhone7> pnHS = nameAndPhone.collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println("Names and phoneNumbers in the set with the type of HashSet:");
        for (NamePhone7 np : pnHS) {
            System.out.println(np.name + " : " + np.phoneNum);
        }
    }
}

