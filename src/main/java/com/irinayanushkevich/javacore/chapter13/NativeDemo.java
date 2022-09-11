package main.java.com.irinayanushkevich.javacore.chapter13;

// пример для среды Windows для реализации платформенно-ориентированного метода на языке С.

class NativeDemo {

    int i;

    public static void main(String[] args) {

        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("The variable ob.i content before calling platform-oriented method: " + ob.i);
        ob.test();
        System.out.println("The variable ob.i content after calling platform-oriented method: " + ob.i);
    }

    public native void test();
    static {
        System.loadLibrary("NativeDemo");
    }
}
