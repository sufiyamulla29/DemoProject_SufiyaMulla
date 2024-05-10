package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        dryRun=false,
        monochrome = true,
        glue={"stepdef"},
        features="src/test/resources/FeatureFiles/LoginTest.feature"


)

public class MyRunnerTest {
}
