package com.test.project.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/mockinterview",
        glue = "com/test/project/stepdefinitions",

        dryRun = false,

        tags="@regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)

public class ProjectRunner {
}
