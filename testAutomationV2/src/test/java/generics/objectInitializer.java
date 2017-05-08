package generics;


import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

import utils.fileHelper;
import utils.objectHelper;
import utils.xlsHelper;
import utils.yamlHelper;

public class objectInitializer extends constant{
	
	public objectInitializer(){
		System.out.println("Wrapping up all classes and Initializing Object");
		log=Logger.getLogger(objectInitializer.class.getSimpleName().toString());
	}

	public void initialize(){
		try{
			file = new fileHelper();
			ymlHelper=new yamlHelper();
			ymlObject=new Yaml();
			objHelper= new objectHelper();
			jsonHelp=new utils.jsonHelper();
			xlsHlep=new xlsHelper();
		}catch(Exception exp){
			log.info(exp.getMessage());
		}
	}
	
}
