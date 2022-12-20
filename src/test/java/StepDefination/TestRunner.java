package StepDefination;






import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		
		
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		
		features = "src/test/java/features",
		//tags = {"@Sanity, @Regression"},
		
				tags = {"@Sanity"},
		
		glue = {"StepDefination"}
		
		
		
		)

public class TestRunner {

}
