package main.java.com.irinayanushkevich.javacore.chapter15;

interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2 {

    public static void main(String[] args) {

        StringFunc reverse = (str) -> {

            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda becomes " + reverse.func("lambda"));
        System.out.println("Expression becomes " + reverse.func("expression"));
    }
}
