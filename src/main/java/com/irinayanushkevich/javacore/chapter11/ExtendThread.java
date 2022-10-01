package main.java.com.irinayanushkevich.javacore.chapter11;

class NewThread2 extends Thread {

    NewThread2() {
        super("Demo thread");
        System.out.println("Child thread created: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread is interrupted");
        }
        System.out.println("Child thread is completed");
    }
}

class ExtendThread {

    public static void main(String[] args) {

        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is completed");
    }
}

