package main.java.com.irinayanushkevich.javacore.chapter13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceOf {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a is exemplar of A");
        }
        if (b instanceof B) {
            System.out.println("b is exemplar of B");
        }
        if (c instanceof C) {
            System.out.println("c is exemplar of C");
        }
        if (c instanceof A) {
            System.out.println("c can be given to A");
        }
        if (a instanceof C) {
            System.out.println("a can be given to C");
        }

        A ob;
        ob = d;
        System.out.println("ob refers to d");

        if (ob instanceof D) {
            System.out.println("ob is exemplar of D");
        }

        ob = c;
        System.out.println("ob refers to c now");

        if (ob instanceof D) {
            System.out.println("ob can be given to D");
        } else {
            System.out.println("ob can not be given to D");
        }
        if (ob instanceof A) {
            System.out.println("ob can be given to A");
        }
        if (a instanceof Object) {
            System.out.println("A can be given to Object");
        }
        if (b instanceof Object) {
            System.out.println("B can be given to Object");
        }
        if (c instanceof Object) {
            System.out.println("C can be given to Object");
        }
        if (d instanceof Object) {
            System.out.println("D can be given to Object");
        }
    }
}
