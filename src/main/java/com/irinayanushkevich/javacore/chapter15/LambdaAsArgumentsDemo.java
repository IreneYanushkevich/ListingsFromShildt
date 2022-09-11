package main.java.com.irinayanushkevich.javacore.chapter15;

interface StringFunction {
    String func(String n);
}

class LambdaAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambda-expressions improve Java effectiveness";
        String outStr;

        System.out.println("It is initial string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("This is the string in upper case: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("This is string without spaces: " + outStr);
    }
}
