package kr.kro.habaek.calculator;

public class ExceptionVariable {
    public static void Main(String args[]) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
    }

    public void checkVariable() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }

    public void checkVariable2() {
        int[] intArray = new int[0];
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }

    public void checkVariable3() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
}
