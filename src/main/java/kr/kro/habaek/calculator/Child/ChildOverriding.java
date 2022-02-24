package kr.kro.habaek.calculator.Child;

import kr.kro.habaek.calculator.Parent.ParentOverriding;

public class ChildOverriding extends ParentOverriding {
        public ChildOverriding() {
            System.out.println("ChildOverriding Constructor");
        }

        private void printName() {
            System.out.println("ChildOverriding printName");
        }

}
