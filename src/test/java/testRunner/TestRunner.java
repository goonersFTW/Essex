package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/java/featureFiles" },
        glue = { "webDriver", "stepDefinition", "testRunner" },
        plugin = {"pretty", "html:reports/html"})
public class TestRunner {


}
