package testManager;

import generics.constant;
import utils.generateReportCucumber;

public class afterExecution extends constant{

	public afterExecution(){
		System.out.println("Object Initialized for After Execution");
		log.info("Object Initialized for After Execution");
	}
	
	public void completeExecution(){
		log.info("Closing All The Drivers ..");
		log.info("Generating Customized Reporting bassed on JSON Logs generated after Execution of this Suite");
		try{
			driver.quit();    
		}catch (Exception exp){
			log.info("Exception Occured while completing the execution .. , Message Recieved :"+exp.getMessage());
		}finally{
			generateReportCucumber.GenerateMasterthoughtReport(constant.platform,constant.browser,constant.branch,constant.buildNumber);	
			System.gc();
		}	
	}
}