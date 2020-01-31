package batchtest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="cs.feature",glue= {"stepdef3"},tags= {"@FunctionalTest,@smoke"},
plugin="json:target/cucumber-report.json")

public class Testrunner {
	

}
