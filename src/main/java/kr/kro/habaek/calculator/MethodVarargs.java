package kr.kro.habaek.calculator;

import kr.kro.habaek.calculator.Member.MemberDTO;

public class MethodVarargs {
    public static void Main(String args[]) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        varargs.calculateNumbers(1, 2, 3, 4, 5);
    }
    public void calculateNumbersWithArray(int []numbers) {

    }
    public void calculateNumbers(int...numbers) {
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        System.out.println("Total="+total);
    }

    public void arbitrary(String message, int...numbers) {
        MemberDTO dto = new MemberDTO("HaBaek", "010-XXXX-YYYY", "???@gmail.com");
        System.out.printf("Name:%s Phone:%s E-Mail:%s\n", dto.name, dto.phone, dto.email);
    }
}
