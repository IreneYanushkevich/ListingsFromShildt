package main.java.com.irinayanushkevich.javacore.chapter11;

class NewThread5 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread5(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is completed");
        }
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {

    public static void main(String[] args) {

        NewThread5 ob1 = new NewThread5("One");
        NewThread5 ob2 = new NewThread5("Two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Suspend Thread One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resume Thread One");
            ob2.mySuspend();
            System.out.println("Suspend Thread Two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Resume Thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        try {
            System.out.println("Waiting Threads completion");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is completed");
    }
}
