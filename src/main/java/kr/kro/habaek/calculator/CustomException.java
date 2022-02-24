package kr.kro.habaek.calculator;

public class CustomException {
    public static void Main(String args[]) {
        CustomException sample = new CustomException();
        try {
            sample.throwsMyException(13);
        } catch (MyException mye) {
            mye.printStackTrace();
        }
    }

    public void throwsMyException(int number) throws MyException {
        try {
            if(number > 12) {
                throws new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
