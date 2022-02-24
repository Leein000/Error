package kr.kro.habaek.calculator.Child;

import kr.kro.habaek.calculator.Parent.Parent;

public class ChildPrint extends Parent {
    public ChildPrint() {
        System.out.println("ChildPrint Constructor");
    }

    public void printAge() {
        System.out.println("printAge() - 18 month");
    }
}
