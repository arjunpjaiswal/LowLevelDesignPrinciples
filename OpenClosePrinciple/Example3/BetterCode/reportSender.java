package LowLevelDesignPrinciples.OpenClosePrinciple.Example3.BetterCode;

import LowLevelDesignPrinciples.OpenClosePrinciple.Example1.BetterCode.Notification;
import LowLevelDesignPrinciples.OpenClosePrinciple.Example3.problematicCode.ReportGenerator;

import java.util.List;

public class reportSender   {
    public void sendReport(List<ReportGeneratorType> reports){
        for(ReportGeneratorType report:reports){

            report.generate();

        }
    }
}
