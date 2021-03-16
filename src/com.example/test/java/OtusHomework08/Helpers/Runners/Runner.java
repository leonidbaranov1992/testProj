package OtusHomework08.Helpers.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Leonid\\IdeaProjects\\homeworks\\testProj\\src\\com.example\\test\\java\\OtusHomework08\\Helpers\\FeatureFiles",
        glue = {"OtusHomework08/Tests"},
        tags = {"~@Help"},
        plugin = {"pretty", "json:target/report.json"}
)
public class Runner {
}
