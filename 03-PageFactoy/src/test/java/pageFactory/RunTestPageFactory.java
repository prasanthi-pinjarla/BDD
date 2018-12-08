package pageFactory;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:pageFactory",glue={"pageFactory"}, plugin= {"pretty"})
public class RunTestPageFactory {

}
