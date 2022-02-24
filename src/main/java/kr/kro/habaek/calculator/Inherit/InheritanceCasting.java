package kr.kro.habaek.calculator.Inherit;

import kr.kro.habaek.calculator.Child.ChildCasting;
import kr.kro.habaek.calculator.Parent.ParentCasting;

public class InheritanceCasting {
    public static void Main(String args[]) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast();
    }

    public void objectCast () {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCast2 () {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent2;
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    private void objectTypeCheck(ParentCasting[] parentArray) {
        for(ParentCasting tempParent : parentArray) {
            if(tempParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
            } else if (tempParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();
            }
        }
    }
}
