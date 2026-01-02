package LowLevelDesignPrinciples.OpenClosePrinciple.Example4.BetterCode;

public class ElectronicProducts implements ProductType{
    int Price;
    @Override
    public double price() {
        return Price*0.1;
    }
}
