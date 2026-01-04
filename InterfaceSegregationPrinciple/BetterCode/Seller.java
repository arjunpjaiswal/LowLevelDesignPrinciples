package LowLevelDesignPrinciples.InterfaceSegregationPrinciple.BetterCode;

public class Seller implements ICanModify,ICanSell,ICanBuy{
    @Override
    public void buy() {
        
    }

    @Override
    public void modify() {

    }

    @Override
    public void sell() {

    }
}
