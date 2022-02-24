package kr.kro.habaek.calculator;

import kr.kro.habaek.calculator.Member.MemberDTO;
import kr.kro.habaek.calculator.Member.MemberManager;
import kr.kro.habaek.calculator.Member.MemberManagerImpl;

public class InterfaceExample {
    public static void Main(String args[]) {
        MemberManager member = new MemberManagerImpl() {
            @Override
            public boolean addMember(MemberDTO member) {
                return false;
            }

            @Override
            public boolean removeMember(String name, String phone) {
                return false;
            }

            @Override
            public boolean updateMember(MemberDTO member) {
                return false;
            }
        }
    }
}

