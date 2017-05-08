package generics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class reporter {
	String Scenario;
	String result ;
    
	@XmlElement
	public void setScenario(String scenario) {
		this.Scenario=scenario;
	}

	@XmlElement
	public void setResult(String result) {
		this.result=result;
	}

	public String getScenario() {
		return Scenario;
	}

	public String getResult() {
		return result;
	}
    
    
}
