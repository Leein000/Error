package kr.kro.habaek.calculator.Array;

public class ArrayInitialize {
    public static void Main(String args[]) {
        ArrayInitValue array = new ArrayInitValue();
        array.otherInit();
        array.getMonth(3);
        System.out.println(array.getMonth(3));
    }

    public void otherInit() {
        int [] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
    }

    public String getMonth(int monthInt) {
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return month[monthInt+1];
    }
}
