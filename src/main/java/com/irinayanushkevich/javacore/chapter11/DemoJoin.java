package main.java.com.irinayanushkevich.javacore.chapter11;

class NewThread4 implements Runnable {

    String name;
    Thread t;

    NewThread4(String threadName) {
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

class DemoJoin {

    public static void main(String[] args) {

        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");
        NewThread4 ob3 = new NewThread4("Three");

        System.out.println("Thread One is started: " + ob1.t.isAlive());
        System.out.println("Thread Two is started: " + ob2.t.isAlive());
        System.out.println("Thread Three is started: " + ob3.t.isAlive());

        try {
            System.out.println("Waiting for threads completion");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Thread One is started: " + ob1.t.isAlive());
        System.out.println("Thread Two is started: " + ob2.t.isAlive());
        System.out.println("Thread Three is started: " + ob3.t.isAlive());

        System.out.println("Main thread is completed");
    }
}