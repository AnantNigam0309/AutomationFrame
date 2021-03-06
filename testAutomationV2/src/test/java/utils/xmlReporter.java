package utils;

import java.io.File;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import generics.constant;
import generics.reporter;

public class xmlReporter extends constant {

	private String scenario;
	
	public xmlReporter(String scenario,String result){
		log.info("xmlReport Integrated with Scenario :" +scenario +" as Result :"+result);
		log=Logger.getLogger(xmlReporter.class.getSimpleName().toString());
		repo=new reporter();
		repo.setResult(result);
		repo.setScenario(scenario);
		this.scenario=scenario;
	}


	public void appendReport(){
		try {
	        String xmlFileName=scenario+".xml";  
	        file.createFile(xmlReportingPath, xmlFileName);
	        File file = new File(xmlReportingPath+xmlFileName);
	        JAXBContext jaxbContext = JAXBContext.newInstance(reporter.class);
	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        jaxbMarshaller.marshal(repo, file);
	        jaxbMarshaller.marshal(repo, System.out);

	      } catch (JAXBException exp) {
	        exp.printStackTrace();
	      } catch (Exception exp){
	    	exp.printStackTrace();
	      } finally{
	    	  System.gc();
	      }
	}
	
}
