package inheritance.multilevel;

public class TestClasses {
    public static void main(String[] args) {
        ParentClass1 parentClass1=new ParentClass1();
        parentClass1.name="Alex";
        parentClass1.id=1;
        System.out.println(parentClass1.name);
        System.out.println(parentClass1.id);
        parentClass1.methodFromParent();
        ChildClass1 childClass1=new ChildClass1();
        childClass1.name="Emily";
        childClass1.id=2;
        System.out.println(childClass1.name);
        System.out.println(childClass1.id);
        childClass1.methodFromParent();
        ChildClass2 childClass2=new ChildClass2();
        childClass2.name="Blake";
        childClass2.id=3;
        System.out.println(childClass2.name);
        System.out.println(childClass2.id);
        childClass2.methodFromParent();
        childClass1.company="Google";
        System.out.println(childClass1.name+ " is working for "+childClass1.company);
        childClass1.methodChild1();

        childClass2.company="Microsoft";
        System.out.println(childClass2.name+ " is working for "+childClass2.company);
        childClass2.methodChild1();

        childClass2.hobby="playing guitar";
        System.out.println(childClass2.name+" loves "+childClass2.hobby);
        childClass2.methodChild2();
    }
}
