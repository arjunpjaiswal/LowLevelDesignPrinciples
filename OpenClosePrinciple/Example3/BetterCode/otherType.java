package LowLevelDesignPrinciples.OpenClosePrinciple.Example3.BetterCode;

public class otherType implements ReportGeneratorType{
    @Override
    public String generate() {
        return " report generator type not supported";
    }
}
