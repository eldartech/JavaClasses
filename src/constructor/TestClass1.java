package constructor;

public class TestClass1 {
    public static void main(String[] args) {
        Class1.emailDomain="yahoo";
        System.out.println(Class1.emailDomain);
        Class1 copyOfClass1 = new Class1("John");
        System.out.println(copyOfClass1.name);
        copyOfClass1.emailDomain="hotmail";
        System.out.println(Class1.emailDomain);
        System.out.println( copyOfClass1.emailDomain);


        Class1 copyOfClass2 = new Class1("Anna");
        copyOfClass2.emailDomain="rambler";
        System.out.println(copyOfClass2.emailDomain);
        System.out.println(copyOfClass2.name);
        copyOfClass2.id=1233532;
        System.out.println(copyOfClass2.id);//1233532

        Class1 copyOfClass3 = new Class1("Jessica");
        System.out.println(copyOfClass3.name);//Jessica



        Class1 copyOfClass4 = new Class1(1299384);
        System.out.println(copyOfClass4.name);//null
        System.out.println(copyOfClass4.id);//1299384

        Class1 copyOfClass5 = copyOfClass4;
        System.out.println("copy5 "+ copyOfClass5.id);

        Class1 copyOfClass6 = new Class1("Joe",124232,"joe@gmail.com");
        System.out.println(copyOfClass6.name);
        System.out.println(copyOfClass6.id);
        System.out.println(copyOfClass6.email);


        Class1[] classes={copyOfClass1,copyOfClass2,copyOfClass3
                ,copyOfClass4,copyOfClass5,copyOfClass6
                ,new Class1("David",1243,"david@gmail.com")};
        System.out.println(classes.length);
        System.out.println(classes[0].name);


    }
}
