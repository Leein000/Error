package kr.kro.habaek.calculator.Control;

public class ControlDoWhile {
    public static void Main(String args[]) {
        ControlDoWhile control = new ControlDoWhile();
        control.doWhile();
    }

    public void doWhile() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        do {
            loop++;
            control.switchCalendar(loop);
        }   while(loop < 12);
    }
}
