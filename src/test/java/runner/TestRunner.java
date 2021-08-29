package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	plugin={"html:test-output/cucumber.html"},
	features="E:\\cks.com\\cucumberframework\\src\\test\\resources\\login.feature",
	glue="stepdefination"
	
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
