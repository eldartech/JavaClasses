package constructor.employeeApp;

public class Position {
    String positionName;
    String  positionId;
    String department;

    Position(String positionName,String positionId, String department){
        this.positionName=positionName;
        this.positionId=positionId;
        this.department=department;
    }

    public String toString(){
        return "\nPosition Name: "+positionName+"\nPosition ID: "+positionId+"\nDepartment: "+department;
    }
}
