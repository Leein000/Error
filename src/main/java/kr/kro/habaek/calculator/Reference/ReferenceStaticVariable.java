package kr.kro.habaek.calculator.Reference;

public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable() {}
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void Main(String args[]) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("HaBaek");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("LIN");
        System.out.println(reference2.name);
    }
}
