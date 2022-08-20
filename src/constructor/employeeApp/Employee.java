package constructor.employeeApp;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private double salary;
    private Position position;
    Employee(int id, String firstName, String lastName,int phoneNumber,double salary, Position position){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.position=position;
    }

    Position getPosition(){
        return position;
    }

    void setPosition(Position position){
        this.position=position;
    }

    String setEmail(){
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@techtorial.com";
       return email;
    }

    String getEmail(){
        return email;
    }

    int getId(){
        return id;
    }

    void setId(int id){
        this.id=id;
    }

    String getFirstName(){
        return firstName;
    }

    void setFirstName(String firstName){
        this.firstName=firstName;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String firstName){
        this.lastName=lastName;
    }

    int getPhoneNumber(){
        return phoneNumber;
    }

    void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    double getSalary(){
        return salary;
    }

    void setSalary(double salary){
        this.salary=salary;
    }

    String getName(){
        return firstName+" "+lastName;
    }

    void setName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    double getAnnualSalary(){
        return salary*12;
    }

    double getHourlyRate(){
        return salary/160;
    }

    void raiseSalary(int percent){
        this.salary+=(percent*salary/100);
    }

    /**
     * This overridden method is returning employee details.
     * @return
     */
    @Override
    public String toString(){
        return "Employee:\nId: "+ id+
                "\nName: "+ getName().toUpperCase()+
                "\nEmail: "+ setEmail()+
                "\nPhone: "+ phoneNumber+
                "\nSalary: "+ salary+
                "\nPosition: "+position
                ;
     }

     void printDetails(){
         System.out.println("Employee:\nId: "+ id+ "\nName: "+ getName().toUpperCase()+ "\nEmail: "+ setEmail()+ "\nPhone: "+ phoneNumber+"\nSalary: "+ salary);
     }

}
