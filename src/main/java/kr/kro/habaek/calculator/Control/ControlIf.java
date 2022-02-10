package kr.kro.habaek.calculator.Control;

public class ControlIf {
    public static void Main(String[] args) {
        ControlIf control = new ControlIf();
    }

    public void ifStatement() {
        int intValue = 10;

        if(intValue > 5) System.out.println("It's bigger than 5");
        else System.out.println("It's smaller or equal than 5");

        if(intValue <= 5) System.out.println("It's smaller or equal than 5");
        else
            System.out.println("It's bigger than 5.");
    }
}
