package kr.kro.habaek.calculator.Control;

public class ControlLabel {
    public static void Main(String args[]) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }

    public void printTimesTable() {
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                System.out.println(level + "*" + unit + "=" + level * unit + "");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case1() {
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 1; unit++) {
                if(level == 4 || unit == 4) continue;
                System.out.println(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case2() {
        for(int level = 2; level < 10; level++) {
            if(level == 4) continue;
            for(int unit = 1; unit < 10; unit++) {
                if(unit == 4) continue;
                System.out.println(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case1() {
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                if(unit == 4) break;
                System.out.println(level + "*" + unit + "=" + level * unit + " ");
            }
            System.out.println();
        }
    }
}
