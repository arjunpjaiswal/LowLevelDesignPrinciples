package LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_HomeWork1;
class Student{
    //...some properties
}

public class SchoolManager {
    public void enrollStudent(Student student){
        //Code for student enrollment
    }
    public void scheduleClasses(){
        //Code to schedule classes
    }
    public void manageTeacherSalaries(){
        //Code for managing teaching salaries
    }
}
