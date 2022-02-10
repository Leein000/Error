package kr.kro.habaek.calculator.Operator;

public class OperatorCompound {
    /*
    정수형인 intValue를 선언하여 10을 할당한다.
    1. 이 값에 5를 더하여 결과를 출력한다.
    2. 1의 결과에서 5를 빼고 결과를 출력한다.
    3. 2의 결과에 5를 곱하고 결과를 출력하자.
    4. 3의 결과에 5를 나누고 결과를 출력하자.
    5. 4의 결과에 5로 나눈 나머지 값을 출력하자.
    6. compound() 메소드를 수행한 결과가 다음과 같은지 확인해 보자.
    */

    public void compound() {
        int intValue1 = 10;
        intValue1 += 5;
        System.out.println(intValue1);
        intValue1 -= 5;
        System.out.println(intValue1);
        intValue1 *= 5;
        System.out.println(intValue1);
        intValue1 /= 5;
        System.out.println(intValue1);
        intValue1 %= 5;
        System.out.println(intValue1);
    }
}



