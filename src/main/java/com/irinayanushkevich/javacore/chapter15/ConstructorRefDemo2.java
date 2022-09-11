package main.java.com.irinayanushkevich.javacore.chapter15;


interface MyFunc5<T> {
    MyClass5<T> func(T n);
}

class MyClass5<T> {

    private T val;

    MyClass5(T v) {
        val = v;
    }

    MyClass5() {
    }

    T getValue() {
        return val;
    }
}

class ConstructorRefDemo2 {

    public static void main(String[] args) {

        MyFunc5<Integer> myClassCons = MyClass5::new;
        MyClass5<Integer> mc = myClassCons.func(100);

        System.out.println("Variable value val in the object = " + mc.getValue());
    }
}
