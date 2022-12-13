package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Features", glue= {"StepDefinition"},
monochrome= true,
stepNotifications = true,
plugin={"pretty", "html:target/HtmlReports.html"}
//plugin= {"pretty","json:target/jsonReports/report.json"}
//plugin= {"pretty","junit:target/junitReports/report.xml"}

		)
public class TestRunner {
	

}
