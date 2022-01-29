package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features/Login.feature",
					glue="steps",
					monochrome=true,
					publish=true,
//					tags="@Regression"
					tags="@Regression or @SIT")
public class CucumberRunner extends BaseClass {
	
	
	

}
