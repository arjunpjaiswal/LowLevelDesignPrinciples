package LowLevelDesignPrinciples.OpenClosePrinciple.Example4.BetterCode;

public class DiscountCalculator {
    public double calculateDiscount(ProductType product){
       return product.price();
    }


}

