package kr.kro.habaek.calculator;

public class ThrowableSample {
    public static void Main(String args[]) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
        }
    }
}
