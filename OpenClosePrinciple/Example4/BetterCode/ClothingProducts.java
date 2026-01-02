package LowLevelDesignPrinciples.OpenClosePrinciple.Example4.BetterCode;

public class ClothingProducts implements ProductType {
int Price;
    @Override
    public double price() {
        return Price*0.2;
    }
}
