package kr.kro.habaek.calculator.Child;

import kr.kro.habaek.calculator.Parent.ParentOverridingPrivate;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        System.out.println("ChildOverridingPrivate Constructor");
    }

    public void printName() {
        System.out.println("ChildOverridingPrivate printName()");
    }
}
