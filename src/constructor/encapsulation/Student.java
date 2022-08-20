package constructor.encapsulation;

public class Student {
    private String firstName;//encapsulation of instance variables
    private String lastName;
    private String ssn;
    private String email;
    private int phoneNumber;

    //Getter Methods are used to retrieve the value of encapsulated instance variables
    String getFirstName(){
        return firstName;
    }

    void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {

        return ssn;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
