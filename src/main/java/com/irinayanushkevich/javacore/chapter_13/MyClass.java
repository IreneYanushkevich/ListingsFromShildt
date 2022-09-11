package main.java.com.irinayanushkevich.javacore.chapter_13;

class MyClass {

    int a, b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        // a = i; b = j;
       this(i, i);
    }

    MyClass() {
        //a = 0; b = 0;
        this(0);
    }

    public static void main(String[] args) {

        MyClass mc = new MyClass(8);

        System.out.println("a = " + mc.a + ", b = " + mc.b);
    }
}
