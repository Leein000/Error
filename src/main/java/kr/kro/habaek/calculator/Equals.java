package kr.kro.habaek.calculator;

import kr.kro.habaek.calculator.Member.MemberDTO;

public class Equals {
    public static void Main(String args[]) {
        Equals thisObject = new Equals();
        thisObject.equalsMethod();
    }

    public void equalsMethod() {
        MemberDTO obj1 = new MemberDTO("HaBaek");
        MemberDTO obj2 = new MemberDTO("HaBaek");
        if(obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }

    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("HaBaek");
        MemberDTO obj2 = new MemberDTO("HaBaek");
        if(obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
