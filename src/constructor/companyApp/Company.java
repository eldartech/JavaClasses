package constructor.companyApp;

public class Company {
    /*
    Company Class:
    instance variables:
    name of the company
    location of the company(City/State)
    yearly budget
    number of employees

    3 constructors - use constructor chaining and overloading

   create any 2 methods:
   print details


   TestCompany:
   create 5 object and assign values to instance variables
   print details for each object using created method
   print all company names who have amount of employees more than 10000

     */
    String name;
    String location;
    double budget;
    int numberOfEmployees;
    static int countOfCompanies;

    Company(String name){
        this.name=name;
    }

    Company(String name,String location){
        this(name);
        this.location=location;
    }

    Company(String name, String location, double budget, int numberOfEmployees){
        this(name,location);
        this.budget=budget;
        this.numberOfEmployees=numberOfEmployees;
        countOfCompanies++;
    }

    void getDetails(){
        System.out.println("Name of Company: "+name+"\nLocation: "+location
                +"\nYearly budget: "+budget+"\nNumber Of Employees: "+numberOfEmployees);
    }

    void updateBudget(double value){
        this.budget=value;
    }

    static void printCompany(Company[] companies){
        for (Company company:companies){
            if (company.numberOfEmployees>10000){
                System.out.println(company.name +" has "+company.numberOfEmployees+" employees.");
            }
        }
    }

    static double totalBudget(Company[] companies){
        double total=0;
        for (int i=0; i<companies.length;i++){
            if (companies[i].budget>1_000){
            total+=companies[i].budget;
            }
        }
        return total;
    }


}
