package main.java.com.irinayanushkevich.javacore.chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Phase " + p + " is completed");
        if (p == numPhases || regParties == 0) {
            return true;
        }
        return false;
    }
}

class MyThread4 implements Runnable {
    Phaser phsr;
    String name;

    MyThread4(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Thread " + name + " begins phase " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PhaserDemo2 {

    public static void main(String[] args) {

        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Threads launching");

        new MyThread4(phsr, "A");
        new MyThread4(phsr, "B");
        new MyThread4(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Phase synchronizer is completed");
    }
}
