package kr.kro.habaek.calculator.Control;

public class ControlElseIf {
    public static void Main(String args[]) {
        ControlElseIf control = new ControlElseIf();
        control.elseIf(85);
    }

    public void elseIf(int point) {
        if(point > 90) {
            System.out.println("A");
        } else if(point > 80) {
            System.out.println("B");
        } else if(point > 70) {
            System.out.println("C");
        } else if(point > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println(point > 80 ? "Good" : "Bad");

        public void elseIf2(int point) {
            String result = point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : point > 60 ? "D" : "F";
            System.out.println(result);
        }

        System.out.println(point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : point > 60 ? "D" : "F");
    }
}
