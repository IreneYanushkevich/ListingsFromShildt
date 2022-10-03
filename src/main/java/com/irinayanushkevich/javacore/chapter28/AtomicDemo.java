package main.java.com.irinayanushkevich.javacore.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Launching of Thread " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + name + " got: " + Shared3.ai.getAndSet(i));
        }
    }
}

class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
