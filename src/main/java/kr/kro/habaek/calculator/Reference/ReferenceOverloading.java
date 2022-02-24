package kr.kro.habaek.calculator.Reference;

public class ReferenceOverloading {
    public static void Main(String[] args){
        ReferenceOverloading reference = new ReferenceOverloading();
    }

    public void print(int data) {

    }

    public void print(String data) {

    }

    public void print(int intData, String stringData) {

    }

    public void print(String stringData, int intData) {

    }
}

