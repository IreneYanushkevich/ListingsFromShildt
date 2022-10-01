package main.java.com.irinayanushkevich.javacore.chapter11;

class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Current thread of execution: " + t);
        t.setName("My Thread");
        System.out.println("After thread name changing: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread of execution is interrupted");
        }
    }
}
