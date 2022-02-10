package kr.kro.habaek.calculator.Operator;

public class OperatorConditional {
    public static void Main(String args[]) {
        OperatorConditional operator = new OperatorConditional();
        operator.condition();
    }

    public void condition() {
        boolean x = true;
        boolean y = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");
        x = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("-----");
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
    }
}
