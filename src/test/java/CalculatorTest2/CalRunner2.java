package CalculatorTest2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/CalculatorTest2/output/cucumber.json",
				})
public class CalRunner2 {

}
