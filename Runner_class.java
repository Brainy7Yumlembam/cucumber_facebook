package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" , "html:target/cucumber-default-report.html","rerun:target/rerun.txt"},features = "src/main/java/Features"
		,glue={"StepDefinition"},dryRun = false,monochrome = true)


public class runner {

}