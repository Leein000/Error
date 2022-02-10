package kr.kro.habaek.calculator.Operator;

public class OperatorRelational {
    public static void Main(String args[]) {
        OperatorRelational operator = new OperatorRelational();
        operator.relational();
    }

    public void relational() {
        int intValue1 = 1;
        int intValue2 = 2;
        System.out.println(intValue1 > intValue2);
        System.out.println(intValue1 < intValue2);
        System.out.println(intValue1 >= intValue2);
        System.out.println(intValue1 <= intValue2);
    }
}
