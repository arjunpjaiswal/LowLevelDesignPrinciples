package LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_HomeWork;
class Order{
// some properties
}
class User{

}
public class OrderProcessor {
    public void processOrder(Order order){
        //Code to process the order
    }
    public void calculateTotalSum(Order order){
        //Codeto calculate sum
    }
}
