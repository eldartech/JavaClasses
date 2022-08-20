package vector;

import java.util.*;

public class VectorPractice {
    public static void main(String[] args) {
        List list=new Vector();
        list.add("Python");
        list.add("C#");
        list.add("C");
        list.add("PHP");
        list.add("Kotlin");
        Vector vector=new Vector<>(100);
        vector.add("Java");
        vector.add(123);
        vector.add(50==100);
        vector.add(true);
        vector.add('A');
        vector.add(2,0.59);
        vector.set(4,false);
        vector.set(vector.indexOf('A'),'Z');
        vector.remove(false);
        System.out.println(vector.contains("Java"));



        System.out.println(vector.capacity());
        System.out.println(vector);
        vector.addAll(0,list);
        System.out.println(vector);
        System.out.println(vector.get(4));
        System.out.println(vector.elementAt(4));
        vector.addElement("JavaScript");
        System.out.println(vector);
//        Enumeration enumeration=vector.elements();
//        while (enumeration.hasMoreElements()){
//            System.out.println(enumeration.nextElement());
//        }
        System.out.println(vector.lastElement());
        vector.add(1,"Java");
        vector.add(vector.size()-2,"Java");
        System.out.println(vector);
        System.out.println(vector.indexOf("Java"));//1
        System.out.println(vector.lastIndexOf("Java"));//10
        System.out.println(vector.lastIndexOf("Java",vector.lastIndexOf("Java")-1));//6
        vector.removeElement("Java");
        System.out.println(vector);
        //vector.removeAllElements();
        System.out.println(vector);
        vector.add(vector.size()/2,"JavaScript");
        System.out.println(vector);
        System.out.println(vector.lastIndexOf("JavaScript",10));
        vector.removeAllElements();
        System.out.println(vector);


    }
}
