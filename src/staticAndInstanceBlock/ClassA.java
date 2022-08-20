package staticAndInstanceBlock;

public class ClassA {
    String name;
    int id;
    static String cityName;
    ClassA(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Inside of Constructor.");
    }

    static {
        cityName="Chicago";
        System.out.println("Inside of Static Block 1");
        System.out.println(cityName);
        System.out.println("==========================");
    }

    {
        System.out.println("Inside Instance Initializer Block 1");
        cityName="Miami";
        System.out.println(cityName);
        System.out.println("----------------------------------");
    }


    static {
        System.out.println("Inside of Static Block 2");
    }

    {
        System.out.println("Inside of Instance Initializer Block 2");
    }


}
