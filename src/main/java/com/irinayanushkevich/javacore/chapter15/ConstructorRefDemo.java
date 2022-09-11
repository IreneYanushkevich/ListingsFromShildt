package main.java.com.irinayanushkevich.javacore.chapter15;

interface MyFunc4 {
    MyClass4 func(int n);
}

class MyClass4 {

    private int val;

    MyClass4(int v) {
        val = v;
    }

    MyClass4() {
    }

    int getValue() {
        return val;
    }
}

class ConstructorRefDemo {

    public static void main(String[] args) {

        MyFunc4 myClassCons = MyClass4::new;
        MyClass4 mc = myClassCons.func(100);

        System.out.println("Variable value val in the object = " + mc.getValue());
    }
}
