package main.java.com.irinayanushkevich.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {

    static void showPush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showPup(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();

        System.out.println("stack: " + st);

        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPup(st);
        showPup(st);
        showPup(st);

        try {
            showPup(st);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
