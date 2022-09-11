package main.java.com.irinayanushkevich.javacore.chapter15;

interface StringFunc3 {
    String func(String n);
}

class MyStringOps2 {

    String strReverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

class MethodRefDemo2 {

    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambda-expressions improve Java effectiveness";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("It is initial string: " + inStr);
        System.out.println("This is a reversed string: " + outStr);
    }
}

