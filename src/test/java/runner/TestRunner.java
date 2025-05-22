package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the feature files
    glue = {"stepDefinitions", "utils"}, // Package containing step definitions and hooks
    plugin = {"pretty", "html:target/cucumber-report.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, // Report formats
    monochrome = true, // Display the console output in a readable format
    tags= "@full"
)
public class TestRunner {
    // Entry point for running Cucumber tests
}