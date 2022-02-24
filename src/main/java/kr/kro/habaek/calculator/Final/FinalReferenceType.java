package kr.kro.habaek.calculator.Final;

import kr.kro.habaek.calculator.Member.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void Main(String args[]) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
        //dto = new MemberDTO();
        dto.name = "HaBaek";
        System.out.println(dto);
    }
}
