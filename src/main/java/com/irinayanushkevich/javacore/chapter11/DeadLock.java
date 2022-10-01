package main.java.com.irinayanushkevich.javacore.chapter11;

class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " came in the a.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A is interrupted");
        }
        System.out.println(name + " try to call b.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In the a.last()");
    }
}

class B {

    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " came in the b.bar()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class B is interrupted");
        }
        System.out.println(name + " try to call a.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In the b.last()");
    }
}

class DeadLock implements Runnable {

    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this, "Concurrent Thread");
        t.start();
        a.foo(b);
        System.out.println("Back to Main Thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back to another Thread");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
