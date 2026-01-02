package LowLevelDesignPrinciples.AbstractClasses_and_Interfaces.abstractClasses;

public abstract class Product {
    //An abstract method
    public abstract double calculateDiscount();

//concrete class
    public void termsAndConditions(){
        System.out.println("terms and conditions");
    }
}
