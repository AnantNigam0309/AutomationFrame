package utils;

import java.util.Map;
import java.util.logging.Logger;
import Engine.testNGTestRunnerCampaign;
import generics.constant;

public class objectHelper extends constant{

	public objectHelper(){
		log=Logger.getLogger(testNGTestRunnerCampaign.class.getSimpleName().toString());
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> ConvertObjectToMap(Object obj){
		Map<String , Object> map =(Map<String, Object>) obj;
		return map;
	}
    
}
