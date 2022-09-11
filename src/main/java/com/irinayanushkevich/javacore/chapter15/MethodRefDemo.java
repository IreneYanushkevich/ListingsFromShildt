package main.java.com.irinayanushkevich.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyStringOps {

    static String strReverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

class MethodRefDemo {

    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambda-expressions improve Java effectiveness";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("It is initial string: " + inStr);
        System.out.println("This is a reversed string: " + outStr);
    }
}
