package kr.kro.habaek.calculator.Inherit;

import kr.kro.habaek.calculator.Child.Child;
import kr.kro.habaek.calculator.Child.ChildOther;
import kr.kro.habaek.calculator.Parent.Parent;

public class InheritancePoly {
    public static void Main(String args[]) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames() {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
