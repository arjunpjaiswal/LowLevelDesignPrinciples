package LowLevelDesignPrinciples.OpenClosePrinciple.Example3.BetterCode;

public class WordGenerator implements ReportGeneratorType{
    @Override
    public String generate() {
        return "Generating Word report";
    }
}
