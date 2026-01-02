package LowLevelDesignPrinciples.AbstractClasses_and_Interfaces.abstractClasses;

public class MacBook extends Product{
    @Override
    public double calculateDiscount(){
        return 0;
    }
    @Override
    public void termsAndConditions(){
        System.out.println("terms and conditions");
    }
}
