package main.java.com.irinayanushkevich.javacore.chapter15;

interface MyFunc6<R, T> {
    R func(T n);
}

class MyClass6<T> {

    private T val;

    MyClass6(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

class MyClass2 {

    String str;

    MyClass2(String s) {
        str = s;
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        MyFunc6<MyClass6<Double>, Double> myClassCons = MyClass6<Double>::new;
        MyClass6<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Value of variable var in the object mc = " + mc.getVal());

        MyFunc6<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("Value of variable str in the object mc2 = " + mc2.getVal());
    }
}

