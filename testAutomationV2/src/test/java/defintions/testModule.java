/**
 * @author anantnigam
 */
package defintions;

import cucumber.api.java.en.Given;

public class testModule {

	@Given("^I am navigating to site$")
	public void NavigateToSite(){
	   System.out.println("I am in given Statement ...");
	}
	
	
	
}
