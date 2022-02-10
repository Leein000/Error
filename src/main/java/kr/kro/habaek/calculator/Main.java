package kr.kro.habaek.calculator;

import kr.kro.habaek.calculator.Control.ControlSwitch;

public class Main {

    public void Calculator(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("calculator class started");
    }

    public void ControlSwitch(String[] args) {
        ControlSwitch control = new ControlSwitch();
        control.swtichStatement2(1);
    }
}
