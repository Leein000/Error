package kr.kro.habaek.calculator.Operator;

public class OperatorCasting {
    public static void Main(String args[]) {
        OperatorCasting operator = new OperatorCasting();
        operator.casting2();
    }

    public void casting() {

    }

    public void casting2() {
        short shortValue = 256;
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue);
        shortValue = 255;
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }

    public void compound() {
        int intValue1 = 10;
        intValue1 += 5;
        System.out.println(intValue1);
        intValue1 -= 5;
        System.out.println(intValue1);
        intValue1 *= 5;
        System.out.println(intValue1);
        intValue1 /= 5;
        System.out.println(intValue1);
        intValue1 %= 5;
        System.out.println(intValue1);
    }
}
