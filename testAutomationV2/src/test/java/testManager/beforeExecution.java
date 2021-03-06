package testManager;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;

import generics.constant;

public class beforeExecution extends constant{

	public beforeExecution(){
		System.out.println("Object Initiaized for Before Execution...");
		log=Logger.getLogger(Logger.class.getName());
	}
	
	public void setLogger(){
		try {
			FileHandler passlog= new FileHandler(logFileLocation);
			log.addHandler(passlog);
			SimpleFormatter logRecord = new SimpleFormatter();
			passlog.setFormatter(logRecord);
			log.setLevel(Level.INFO);
		} catch (IOException exp) {
			log.info("Exception Occured while Setting Logger , Message:: "+exp.getMessage());
		} catch (SecurityException exp){
			log.info("Exception Occured while Setting Logger , Message:: "+exp.getMessage());
		} catch (Exception exp){
		    log.warning("Exception Occured while Setting Logger , Message:: "+exp.getMessage());
		} finally{
			log.info("-----------------------------------");
			log.info("Logger Set in class beforeExecution");
		}
	}
	
	public void deleteXMLDirectoryFiles(){
		 try{
			  FileUtils.cleanDirectory(new File(xmlReportingPath));
		 }catch (Exception exp){
			 exp.printStackTrace();
			 log.info(exp.getMessage());
		 }finally {
			 log.info("deleted XML Directory Files");
		 }
	}
}
