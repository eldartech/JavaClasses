package constructor.companyApp;

public class TestCompany {
    public static void main(String[] args) {
        Company company1=new Company("Google","California",100000.24d,25000);
        company1.getDetails();
        Company company2=new Company("Microsoft","Seattle",200000.434d,30000);
        company2.getDetails();
        Company company3=new Company("Apple","California",65423.324d,9000);
        company3.getDetails();
        Company company4 = new Company("Samsung","Korea",23425d,9990);
        company4.getDetails();
        Company company5 = new Company("Ali Baba","China",24342.3d,899999);
        company5.getDetails();
        Company[] companies={company1,company2, company3,company4,company5};
        Company.printCompany(companies);
        company5.updateBudget(123443);
        company5.getDetails();
        System.out.println(Company.totalBudget(companies));

    }
}
