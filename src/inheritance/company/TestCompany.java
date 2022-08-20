package inheritance.company;

public class TestCompany {
    public static void main(String[] args) {
        Google google=new Google("Google",1998,1000000);
        google.service();
//        System.out.println(google.isHiring());
//        System.out.println(google.companyName);
//        System.out.println(google.beginYear);
//        System.out.println(google.numberOfEmployees);
        System.out.println(google);
        Starbucks starbucks=new Starbucks("Starbucks:Seattle",1999);
        System.out.println(starbucks);
    }
}
