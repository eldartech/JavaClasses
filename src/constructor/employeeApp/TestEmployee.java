package constructor.employeeApp;

public class TestEmployee {
    public static void main(String[] args) {
            Position position=new Position("SDET","D-150","Delivery");
            Employee employee=new Employee(0001,"AdAm","Johnson",1231234123,6000,position);
     //   System.out.println(employee);
//        employee.printDetails();

        System.out.println(employee.getName());
        System.out.println("Annual Salary: "+employee.getAnnualSalary());
        System.out.println("Hourly Rate: "+employee.getHourlyRate());
        employee.raiseSalary(10);
        System.out.println(employee);

    }
}
