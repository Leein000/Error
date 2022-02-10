package kr.kro.habaek.calculator.Control;

public class ControlWhile {

    public ControlOfFlow control = new ControlOfFlow();

    public static void Main(String args[]) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileBreak();
    }

    public static void ControlOfFlow(String args[]) {
        ControlOfFlow control = new ControlOfFlow();
        control.switchCalendar(int month);
    }

    public void whileLoop1() {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
    }

    public void whileLoop2() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if(loop == 6) loop = 100;
        }

        public void whileBreak() {
            ControlSwitch control = new ControlSwitch();
            int loop = 0;
            while (loop < 12) {
                loop++;
                control.swtichCalendar(loop);
                if(loop == 6) break;
            }
        }
    }
}
