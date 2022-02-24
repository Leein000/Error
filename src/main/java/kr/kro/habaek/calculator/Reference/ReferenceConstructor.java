package kr.kro.habaek.calculator.Reference;

import kr.kro.habaek.calculator.Member.MemberDTO;

public class ReferenceConstructor {
    public static void Main(String args[]) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO("HaBaek");
        MemberDTO dto2 = new MemberDTO("HaBaek");
        MemberDTO dto3 = new MemberDTO("HaBaek", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("HaBaek", "010XXXXYYYY", "XXXX@gmail.com");
    }
}
