package LowLevelDesignPrinciples.OpenClosePrinciple.Example3.BetterCode;

public class pdfReport implements ReportGeneratorType{

    @Override
    public String generate() {
        return  "Generating PDF report";
    }





}
