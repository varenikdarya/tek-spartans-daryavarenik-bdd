package tek.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/CreateAccount.feature",
        glue = "tek.bdd.steps",
        dryRun = false
)
public class TestRunner {
}

