package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/features",plugin = "json:target/jsonReports/cucumber-report.json", glue = {"stepDefinitions"})

//tags = {"@DeletePlace"} plugin = "json:target/jsonReports/cucumber-report.json",
// cd /Users/nandakishor.ban/eclipse-workspace/APIFramework
//mvn test verify -Dcucumber.Options="--tags @AddPlace"
//mvn test verify -Dcucumber.filter.tags="@AddPlace"

public class TestRunner {

}


//To run from CMD- first delete test.app file
//C:\Users\Asus\eclipse-workspace\APIFramework2>mvn compile
//C:\Users\Asus\eclipse-workspace\APIFramework2>mvn test - will do both
//mvn verify -Dcucumber.filter.tags="@debug1 or @debug2"- worked with tag
//C:\Users\Asus\eclipse-workspace\APIFramework2>mvn test -Dcucumber.options="--tag '@DeletePlace'"-not worked