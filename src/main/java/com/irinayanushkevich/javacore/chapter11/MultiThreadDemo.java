package main.java.com.irinayanushkevich.javacore.chapter11;

class NewThread3 implements Runnable {

    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is completed");
    }
}

class MultiThreadDemo {

    public static void main(String[] args) {

        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is completed");
    }
}

