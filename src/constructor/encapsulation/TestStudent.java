package constructor.encapsulation;

import java.util.Locale;

public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setFirstName("Abby");
        System.out.println(student.getFirstName());
        student.setLastName("Gale");
        System.out.println(student.getLastName());
        String email = String.format("%s.%s@techtorial.org",student.getFirstName().toLowerCase()
                ,student.getLastName().toLowerCase());
        student.setEmail(email);
        System.out.println(student.getEmail());
        student.setSsn("111-11-9999");//****-**-9999
        StringBuilder sb=new StringBuilder("111-11-9999");


    }
}
