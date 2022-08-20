package inheritance.company;

public class Google extends Company {
    int numberOfEmployees;

    public Google(String companyName, int beginYear, int numberOfEmployees) {
        super(companyName, beginYear);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public boolean isHiring() {
        return true;
    }

    @Override
    public void service() {
        System.out.println("Google is giving IT services. Search functionality browser.");
    }



    @Override
    public String toString() {
        return "Google:" +
                "\nCompany Name: " + companyName +
                "\nBegin Year: " + beginYear +
                "\nNumber Of Employees: " + numberOfEmployees;
    }
}
