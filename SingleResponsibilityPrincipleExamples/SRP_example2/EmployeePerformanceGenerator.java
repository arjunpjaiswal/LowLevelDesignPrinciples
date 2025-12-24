package LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_example1.SRP_example2;

import LowLevelDesignPrinciples.SingleResponsibilityPrincipleExamples.SRP_example1.BadCode.Employee;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee){
        if(reportType.equals("PDF")){
            return "Generating PDF report.";}
         else if(reportType.equals("word")){
              return "Generating Word report";
            }
         return "Report type not supported";
        }

}
//Here SRP is applicable but violate other principle
