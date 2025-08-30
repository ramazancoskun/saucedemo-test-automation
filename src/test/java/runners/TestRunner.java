package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions","utils","hooks"},
        plugin ={
        "pretty",
        "html:target/html-report/cucumber-report.html",
        "json:target/json-reports/cucumber-report.json",
        },
        dryRun = false,
        monochrome = true
)
        public class TestRunner {

        }
