package kr.kro.habaek.calculator;

public class VariableTypeKor {
    int instanceVariable;
    static int classVariable;

    public void method(int parameter) {
        int localVariable;
    }

    public void anotherMethod() {
        if(true) {
            int localVariable;
            if(true) {
                int localVariable;
            }
        }
        if(true) {
            int localVariable;
        }
    }
}
