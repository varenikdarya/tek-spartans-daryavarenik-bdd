package tek.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        dryRun = false,
        tags = "@CreateNewAccount",
        plugin = {
                "html:target/cucumber_report/index.html"
        }
)
public class TestRunner {
}

