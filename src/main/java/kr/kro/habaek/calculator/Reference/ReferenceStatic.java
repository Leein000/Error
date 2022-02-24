package kr.kro.habaek.calculator.Reference;

public class ReferenceStatic {
    String name = "Min";

    public static void Main(String args[]) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is a staticMethod.");
    }

    public static void staticMethodCallVariable() {
        public static String name;
        System.out.println(name);
    }
}
