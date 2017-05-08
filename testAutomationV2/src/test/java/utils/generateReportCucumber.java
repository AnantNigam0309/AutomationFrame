package utils;

import java.io.File;

import generics.constant;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class generateReportCucumber {
	public static void GenerateMasterthoughtReport(String Platform,String Browser,String Branch,String buildNum){
        try{
            File reportOutputDirectory = new File("target/Masterthought");
            
            constant.listCucumberReport.add("target/CampaignDestination/Campaign.json");
            

            String buildNumber = buildNum;
            boolean runWithJenkins = false;
            boolean parallelTesting = true;

            Configuration configuration= new Configuration(reportOutputDirectory, "Capillary Reporting");
            configuration.setParallelTesting(parallelTesting);
            configuration.setRunWithJenkins(runWithJenkins);
            configuration.setBuildNumber(buildNumber);
         
            configuration.addClassifications("Platform", Platform);
            configuration.addClassifications("Browser", Browser);
            configuration.addClassifications("Branch", Branch);
            ReportBuilder reportBuilder=new ReportBuilder(constant.listCucumberReport, configuration);

            reportBuilder.generateReports();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}