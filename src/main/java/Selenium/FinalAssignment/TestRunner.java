package Selenium.FinalAssignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinition",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
