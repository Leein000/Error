package kr.kro.habaek.calculator.Reference;

import kr.kro.habaek.calculator.Member.MemberDTO;

public class ReferencePass {
    public static void Main(String args[]) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByValue();
    }

    public void callPassByValue() {
        int a = 10;
        String b ="b";
        System.out.println("before passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("HaBaek");
        System.out.println("before passByReference");
        System.out.println("member.name="+member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name="+member.name);
    }

    public void passByReference(MemberDTO member) {
        member.name = "HaBaek";
        System.out.println("in passByReference");
        System.out.println("member.name="+member.name);
    }
}
