package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:featureFiles/", 						// for feature file location
		glue = {"stepDef",
				"hubspot.uiAutomation.testbase"							
		},															// for step definitions & test base to use hooks
		plugin = {"pretty","html:target/test-output"},				// for report	
		dryRun = false, 					  						// will not execute test steps but it will check if all steps are mapped to step. to execute steps make is false. 	
		monochrome = true					  						// it will create out put in readable format	
		
		)
public class TestRunner {

}
