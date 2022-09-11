package main.java.com.irinayanushkevich.javacore.chapter_13;

class AssertDemo {

    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {

        int n = 0;

        for (int i = 0; i < 10; i++) {

            n = getNum();
            assert n > 0 : "n is negative";
            System.out.println("n = " + n);
        }
    }
}
