package main.java.com.irinayanushkevich.javacore.chapter28;

import javax.smartcardio.ATR;
import java.util.concurrent.locks.ReentrantLock;

class LockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class Shared2 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Launch of the Thread " + name);
        try {
            System.out.println("Thread " + name + " is waiting of counter blocking");
            lock.lock();
            System.out.println("Thread " + name + " blocks counter");
            Shared2.count++;
            System.out.println("Thread " + name + " : " + Shared2.count);
            System.out.println("Thread " + name + " is waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thread " + name + " unlocks counter");
            lock.unlock();
        }
    }
}