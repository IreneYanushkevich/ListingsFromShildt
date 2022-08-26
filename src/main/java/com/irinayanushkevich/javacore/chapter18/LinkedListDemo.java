package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.LinkedList;

class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Initial contents of the linked list ll: " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("The content of the linked list ll after the elements have been removed: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("The contents of the linked list ll after removing the first and last elements: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " changed");

        System.out.println("Content of linked list ll after change: " + ll);
    }
}
