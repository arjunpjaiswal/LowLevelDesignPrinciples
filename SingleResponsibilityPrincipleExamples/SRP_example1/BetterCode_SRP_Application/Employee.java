package LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_example1.BetterCode_SRP_Application;

public class Employee {
    private final int employeeId;
    public Employee(int id){
        this.employeeId=id;
    }
    public int getEmployeeId(){
        return this.employeeId;
    }
}
