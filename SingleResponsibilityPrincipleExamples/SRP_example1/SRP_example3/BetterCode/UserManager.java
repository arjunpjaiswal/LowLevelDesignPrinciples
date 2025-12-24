package LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_example1.SRP_example3.BetterCode;

public class UserManager {
    public void createUser(String username){
        //Code to create a user
        // this.userRepo.create(...);
    }
    public void deleteUser(String username){
        //Code to delete a user
        //this.userRepo.destroy(...);
    }
}
