package main.java.com.irinayanushkevich.javacore.chapter28;

import java.util.concurrent.Phaser;

class PhaserDemo {

    public static void main(String[] args) {

        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Threads launching");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is completed");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is completed");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " is completed");

        phsr.arriveAndDeregister();

        if (phsr.isTerminated()) {
            System.out.println("Phase synchronizer is completed");
        }
    }
}

class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Thread " + name + " begins the first phase");
        phsr.arriveAndAwaitAdvance();
        System.out.println("Thread " + name + " begins the second phase");
        phsr.arriveAndAwaitAdvance();
        System.out.println("Thread " + name + " begins the third phase");
        phsr.arriveAndDeregister();
    }
}

